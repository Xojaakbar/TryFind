package uz.gita.luis.tryfind.UI.Menu

interface MenuContract {
    interface View{
        fun goToLogical()
        fun goToWorldly()
        fun gotoClosedTest()
    }

    interface Presenter{
        fun sayGoToClosedTest()
        fun sayGoToLogical()
        fun sayGoToWorldly()
    }

    interface Model{

    }

}