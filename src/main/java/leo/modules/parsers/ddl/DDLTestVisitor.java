package leo.modules.parsers.ddl;

public class DDLTestVisitor extends DDLBaseVisitor<String> {
    @Override
    public String visitFile(DDLParser.FileContext ctx) {
        return "asd";
    }

    @Override
    public String visitInput(DDLParser.InputContext ctx) {
        return "input";
    }
}
