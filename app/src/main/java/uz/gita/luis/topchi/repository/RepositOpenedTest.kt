package uz.gita.luis.tryfind.repository

import uz.gita.luis.topchi.model.OpenedTestData


public class RepositOpenedTest private constructor() {

     lateinit var testList: MutableList<OpenedTestData>
     var indexForTest = 0
     var maxCountTest = 0
     set(value) {
        answersBoolean = BooleanArray(value)
        field = value
     }
     var correct = 0
     var wrong = 0
     var skip = 0
     lateinit var answersBoolean : BooleanArray
     var tests: MutableList<OpenedTestData> = ArrayList()
     var answers: MutableList<String> = ArrayList(maxCountTest)

    companion object{
       private var repositOpenedTest: RepositOpenedTest? = null
        fun getInstance() : RepositOpenedTest{
            if (repositOpenedTest == null)
                repositOpenedTest = RepositOpenedTest()
            return repositOpenedTest as RepositOpenedTest
        }
    }
    fun setIndexTest(index: Int){
        indexForTest = index
        if (index == 0) {
            wrong = 0
            correct = 0
            answersBoolean = BooleanArray(maxCountTest)
            shuffleTest()
        }
    }

    init {
        loadOpenedTest()
    }

    private fun loadOpenedTest(){
        testList = ArrayList()

        testList.add(OpenedTestData(
            "Tojimurodning 14ta qo'yi bor edi, 9tadan boshqa barchasi o'lib qoldi, unda hozir nechta qo'y qoldi?",
            "5ta",
            "23ta",
            "9ta",
            "bilmadim endi",
            "9ta"
        ))


        testList.add(OpenedTestData(
            "1 yilda 28 kunga ega necha oy bor?",
            "1",
            "unaqa oy yo'q, quyosh bor lekin",
            "vaziyatga qarab",
            "12",
            "12"
        ))

        testList.add(OpenedTestData(
            "kilogramm paxta o'g'irmi kilogram tosh?",
            "tosh",
            "paxta",
            "taroziga bog'liq",
            "teng",
            "teng",
        ))

        testList.add(OpenedTestData(
            "Kechasi yonib turgan 7ta shamdan 3tasini o'chirib qo'ydim, ertalab menda nechta sham qoldi?",
            "4",
            "3",
            "7",
            "qolmaydi",
            "3",
        ))

        testList.add(OpenedTestData(  "Agar tunda yomg'ir yog'ayotgan bo'lsa, 72soatdan keyin quyosh chiqishini tahmin qilsa bo'ladimi?",
            "bir-biriga aloqasi yo'q",
            "ha",
            "kim bladi",
            "yo'q",
            "yo'q",
        ))


        testList.add(OpenedTestData( "Agar 3ta tovuq 3kunda 3ta tuxum qo'ysa, xuddi shunaqa 12ta tovuq 12kunda nechta qo'yadi?",
            "12",
            "24",
            "48",
            "144",
            "48"))


        testList.add(OpenedTestData( "Agar kechagi kun ertaga bo'lganda, bugun yakshanba bo'lar edi. Qaysi kuni aytilgan gap?",
            "dushanba",
            "yakshanba",
            "shanba",
            "Seshanba",
            "Seshanba"))
        //############################################################################################################
        testList.add(OpenedTestData("Finlandiya poytaxti?",
            "budapesht",
            "Xelsinke",
            "varshava",
            "stokgolm",
            "Xelsinke"))
        testList.add(OpenedTestData("Kosmonavtlar uchayotganda nimani yo'qotishadi?",
            "uyqusini",
            "xotirasini",
            "og'irligini",
            "xushini",
            "og'irligini"))
        testList.add(OpenedTestData("Yaponiyaning milliy guli?",
            "sake",
            "ilhaq",
            "sakura",
            "gulpiyoz",
            "sakura"))
        testList.add(OpenedTestData("AQSh bayrog'ida nechta chiziq bor?",
            "12",
            "13",
            "1",
            "122",
            "13"))
        testList.add(OpenedTestData("Avstraliyaning milliy hayvoni nima?",
            "puma",
            "qizil kenguru",
            "pitlord",
            "fil",
            "qizil kenguru"))
        testList.add(OpenedTestData("1923 yilgacha Turkiyaning Istanbul shahri nima deb atalgan?",
            "Konstantinopol",
            "persepolis",
            "do'rmon",
            "isfara",
            "Konstantinopol"))
        testList.add(OpenedTestData("Kolizey qayerda joylashgan?",
            "Rim",
            "parij",
            "yunoniston",
            "mongoliya",
            "Rim"))
        testList.add(OpenedTestData("1952-yilda Albert Eynshteyn qaysi davlat prezidenti etib taklif qilingan?",
            "bangladesh",
            "gretsiya",
            "shvetsiya",
            "Isroil",
            "Isroil"))
        testList.add(OpenedTestData("Qaysi ko'l ko'pincha Italiya ko'llarining marvaridlari deb ataladi?",
            "komo ko'li",
            "sitsilia ko'li",
            "pingorio ko'li",
            "oq qush ko'li",
            "komo ko'li"))
        testList.add(OpenedTestData("Ozodlik haykali qayerda joylashgan?",
            "Parij",
            "rim",
            "New York",
            "angliya",
            "New York"))
        testList.add(OpenedTestData("Avstraliyada bahor qaysi oyda boshlanadi?",
            "fevral",
            "mart",
            "yangi yildan",
            "sentyabr",
            "sentyabr"))
        testList.add(OpenedTestData("Sog'lom insonda odatda nechta tish bo'ladi?",
            "36",
            "28",
            "32",
            "33",
            "32"))
        testList.add(OpenedTestData("Nima qishda qorboboning burni o'rnida ishlatiladi?",
            "zubachistka",
            "sabzi",
            "chelak",
            "naushnik",
            "sabzi"))
        testList.add(OpenedTestData("Qaysi davlatda bahor yarim yil davom etadi?",
            "Avstraliyada",
            "Rossiyada",
            "Amerikada",
            "Angliyada",
            "Rossiyada"))
        testList.add(OpenedTestData("Qaysi ovqat yapon milliy taomi hisoblanadi?",
            "Pasta",
            "Kimchi",
            "Sushi",
            "Pitsa",
            "Sushi"))
        testList.add(OpenedTestData("IQ nimani anglatadi?",
            "Muhim sifat",
            "Intellektual savol",
            "Itellekt foizi",
            "Tezlik bilan javob qaytarish",
            "Itellekt foizi"))
        maxCountTest = testList.size
        shuffleTest()
    }
        fun shuffleTest(){
            testList.shuffled()
        }

     fun getNeedDataTestByCount(count: Int): MutableList<OpenedTestData> {
        return testList.subList(0, count)
    }

}