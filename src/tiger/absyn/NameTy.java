package tiger.absyn;

import tiger.symbol.Symbol;

public class NameTy extends Ty {

    public Symbol name;

    public NameTy(int p, Symbol n) {
        pos = p;
        name = n;
    }
}