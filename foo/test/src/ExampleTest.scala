package foo

import utest._

object ExampleTest extends TestSuite {
    def tests = Tests {
        test("hello") {
            val result = Example.hello()
            assert(result == "Hello, world!")
            result
        }
    }
}