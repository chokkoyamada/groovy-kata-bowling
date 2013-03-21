
/**
 *
 * Created with IntelliJ IDEA.
 * User: A12353
 * Date: 13/03/21
 * Time: 18:39
 * To change this template use File | Settings | File Templates.
 */
class ScoreBoard {
    List<Tuple> scores = [];

    def addScore(score){
        scores.add(score)
    }

    def totalScore(){
        def totalScore = 0
        scores.each  { s ->
            totalScore += s.get(1)
        }
        totalScore
    }

}
