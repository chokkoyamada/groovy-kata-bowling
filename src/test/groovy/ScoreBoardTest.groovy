import spock.lang.Specification
import ScoreBoard

/**
 * Created with IntelliJ IDEA.
 * User: A12353
 * Date: 13/03/21
 * Time: 18:47
 * To change this template use File | Settings | File Templates.
 */
class ScoreBoardTest extends Specification {
    def "scoreboard test"(){
        def scoreboard= new ScoreBoard()
        expect:
        scoreboard.addScore(score)
        scoreboard.scores.size() == length

        where:
        score | length
        new Tuple(1, 10) | 1

    }

    def "test totalscore"(){
        def scoreboard = new ScoreBoard()
        expect:
        scoreboard.addScore(score1)
        scoreboard.addScore(score2)
        scoreboard.totalScore() == totalscore

        where:
        score1 | score2 | totalscore
        new Tuple(1, 10) | new Tuple(2, 8) | 18
    }

}
