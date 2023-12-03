package uz.gita.luis.tryfind.UI.Logic

import uz.gita.luis.topchi.model.OpenedTestData
import uz.gita.luis.tryfind.repository.RepositOpenedTest

class LogicModel: LogicalContract.Model {
    val repositOpenedTest: RepositOpenedTest = RepositOpenedTest.getInstance()
    var list: MutableList<OpenedTestData> = ArrayList()
    var position: Int = 0
    init {
        list.addAll(repositOpenedTest.testList)
        list.shuffle()
    }
    override fun checkAnswer(answer: String) : Boolean {
        return list[position].answer == answer
    }

    override fun giveNextTest(): OpenedTestData {
        if (++position==list.size){
            position=0}
        return list[position]
    }
}