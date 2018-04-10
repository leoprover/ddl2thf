ddl(a1, axiom, $O(processDataLawfully)).  % -- an "axiom" makes the formula globally valid
                                          % as in 'valid $O(processDataLawfully)'

ddl(a2, axiom, (~processDataLawfully) => $O(eraseData)). % same here. globally valid.

ddl(a3, localAxiom, ~processDataLawfully). % only valid at current world

%ddl(c1, conjecture, $O(eraseData)). % all ok. conjecture is whether $(eraseData) is globally valid.

% ddl(c2, localConjecture, $O(eraseData)). % at local world
 ddl(c3, conjecture, $O(kill)). % all good here.
