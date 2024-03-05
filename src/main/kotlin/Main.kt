fun main() {

    val baseClass = BaseTest()
    val testClass = TestClass<BaseTest>()

    testClass.runTest(baseClass) {
        testClass.test() }
}