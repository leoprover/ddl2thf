# ddl2thf
DDL2THF -- A preprocessor for translating problems in Dyadic Deontic Logic into THF problems

## Synopsis
The tool translates a problem statement formulated in Carmo/Jones' Dyadic Deontic Logic [1] into
the standard THF format [2] for higher-order theorem provers. This translation employs
a semantical embedding approach by Benzmüller et al. [3].
It can be used to pre-process a problem in such a way that standard THF provers can be used for the reasoning process.

## Leo-III
This tool has been integrated into the higher-order automated theorem prover Leo-III [4].
See the [GitHub page of Leo-III](https://github.com/leoprover/Leo-III) for more details.

## Language
The syntax adapts a TPTP-like problem specification, similar to the FOF syntax [5].
Each input statement is of the form

```
ddl(name,role,formula).
```
where
-  `name` is an arbitrary alphanumerical name,
-  `role` is either `axiom`, `localAxiom`, `conjecture` or `localConjecture`, and
-  `formula` is a DDL formula (see below).

DDL formulas are given by

| Syntax (Formulas)   | Interpretation |
| ------------- | ------------- |
| `$true`  | Propositional truth  |
| `$false`  | Propositional falsehood  |
| `p` *where `p` is any lower-case string*  | Propositional variable  |
| `~ p` | Negation of `p`  |
| `p & q` | Conjuction of `p` and `q` |
| `p | q` | Disjunction of `p` and `q` |
| `p => q` | Implication from `p` to `q` |
| `p <=> q` | Equivalence of `p` and `q` |
| `$box_a(p)` | In all actual worlds `q` |
| `$box_p(p)` | In all possible worlds `p` |
| `$box(p)` | In all worlds `p` |
| `$O(p/q)` | It ought to be `p` given `q` (dyadic deontic obligation) |
| `$O_a(p)` | Actual monadic deontic obligation `p` |
| `$O_p(p)` | Primary monadic deontic obligation `p` |
| `$O(p)` | It ought to be `p` (shorthand for `$O(p/$true)`) |

## Example
```
ddl(a1, axiom, $O(processDataLawfully)).  % -- an "axiom" makes the formula globally valid
                                          % as in 'valid $O(processDataLawfully)'
ddl(a2, axiom, (~processDataLawfully) => $O(eraseData)). % same here. globally valid.
ddl(a3, localAxiom, ~processDataLawfully). % only valid at current world

ddl(c1, conjecture, $O(eraseData)). % all ok. conjecture is whether $O(eraseData) is globally valid.
```

A simple invocation of Leo-III verifies the conjecture (assuming that the problem is stored as `gdpr.p`)*:
```
[lex@gaunab]$ leo3 gdpr.p --ddl
% Axioms used in derivation (2): a3, a2
% No. of inferences in proof: 13
[...]
% SZS status Theorem for src/test/resources/gdpr.p : 2248 ms resp. 1008 ms w/o parsing
``` 

*: Leo-III natively include te ddl2thf tool so that no pre-processing into THF is necessary.

## Installation
DDL2THF requires the Scala 2.12.X.

## Using a pre-compiled release
tba

## Building from source
If you have the Scala Build Tool (SBT) installed, simply run
```
make
```
This will create a .jar in the `bin` directory.
You can create/install an executable `ddl2thf` via
```
make install
```
This will create the binary in `$USER/bin/`.

## Usage

```
DDL2THF -- Encoding of Carmo/Jones DDL into HOL
(c) 2018 Alexander Steen

Usage: ddl2thf <infile> [<outfile>]

Parameters:
<infile>   - The file that contains a problem in DDL syntax.
             Use '-' (without quotes) to read from stdin.
<outfile>  - The file name in which the encoded result will be written
             (all parent directorys must already exist).
             If omitted, the result is printed to stdout.
```

## References
[1] J. Carmo and A.J.I. Jones. Deontic logic and contrary-to-duties. In D. M. Gabbay and F. Guenthner, editors, Handbook of Philosophical Logic: Volume 8, pages 265–343. Springer Netherlands, Dordrecht, 2002.
[2]	Automated Reasoning in Higher-Order Logic using the TPTP THF Infrastructure (Geoff Sutcliffe, Christoph Benzmüller), In Journal of Formalized Reasoning, volume 3, number 1, pp. 1-27, 2010.
[3] Faithful Semantical Embedding of a Dyadic Deontic Logic in HOL (Christoph Benzmüller, Ali Farjami, Xavier Parent), Technical report, CoRR, 2018. (https://arxiv.org/abs/1802.08454, submitted )
[4] The Higher-Order Prover Leo-III (Alexander Steen, Christoph Benzmüller), In Automated Reasoning --- 9th International Joint Conference, IJCAR 2018, Oxford, UK, July 14-17, 2018, Proceedings (Didier Galmiche, Stephan Schulz, Roberto Sebastiani, eds.), Springer, LNCS, 2018. (forthcoming) 
[5] Sutcliffe, G. (2017). The TPTP Problem Library and Associated Infrastructure: From CNF to TH0, TPTP v6.4.0. Journal of Automated Reasoning, 1-20. DOI: 10.1007/s10817-017-9407-7
