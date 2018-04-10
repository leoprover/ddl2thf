DESTDIR ?= $(HOME)/bin

default: all

all:
		@echo Building DDL2THF ...
		sbt assembly
		mkdir bin -p
		cp target/scala-2.12/ddl2thf.jar bin/ddl2thf.jar

install:
		install -m 0755 -d $(DESTDIR)
		install -m 0755 bin/ddl2thf.jar $(DESTDIR)
		echo -e "#!/bin/bash\njava -Xss32m -Xmx256m -jar $(DESTDIR)/ddl2thf.jar \$$@" > $(DESTDIR)/ddl2thf
		chmod +x $(DESTDIR)/ddl2thf

clean:
		rm -rf target/

