package dsldemo.dsl

class CaminhadaDsl {

    static void caminhadas(
            @DelegatesTo(DemoDsl) Closure closure
    ) {
        DemoDsl dsl = new DemoDsl()
        closure.delegate = dsl
        closure()
    }

}
