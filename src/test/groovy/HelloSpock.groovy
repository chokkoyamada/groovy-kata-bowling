import Hello
/**
 * Created with IntelliJ IDEA.
 * User: A12353
 * Date: 13/03/21
 * Time: 18:30
 * To change this template use File | Settings | File Templates.
 */
class HelloSpock extends spock.lang.Specification {
    def "length of Spock's and his friends' names"() {
        expect:
        name.size() == length

        where:
        name     | length
        "Spock"  | 5
        "Kirk"   | 4
        "Scotty" | 6
        "Yamada" | 6
    }

    def "greeting test"(){
        def hello = new Hello()

        expect:
        hello.greet(name) == greeting

        where:
        name | greeting
        "Yamada" | "Hello Yamada!"
    }
}
