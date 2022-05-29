package com.example.koreanlearningbyjapanese

object Constants {


    //  Create a constant variables which we required in the result screen
    const val USER_NAME: String = "user_name"
    const val TOTAL_QUESTIONS: String = "total_questions"
    const val CORRECT_ANSWERS: String = "correct_answers"
    fun getQuestions(): ArrayList<Question>{
        val questionsList = ArrayList<Question>()
        //1
        val que1 = Question(
            1,
            "Select correct Japanese words with the same meaning of Korean words in brackets.",
                """
            강남 (까지) 가는데 시간이 어느 정도예요? 
            江南(__)行くのに時間がどれくらいですか？""",
            "まで","に",
            1)
        questionsList.add(que1)
        //2
        val que2 = Question(
            2,
            "Select correct Japanese words with the same meaning of Korean words in brackets.",
            """
             부모님 (께) 드리고 싶은 선물이 있어요.
             両親(__)差し上げたいお土産があります""",
            "まで","に",
            2)
        questionsList.add(que2)
        //3
        val que3 = Question(
            3,
            "Select correct Japanese words with the same meaning of Korean words in brackets.",
            """
             오래 전에 주문했 (지만) 요리가 아직 안 왔어요. 
             ずっと前に注文した(___)、料理がまだ来てません。""",
            "〜から","〜のだが",
            2)
        questionsList.add(que3)
        //4
        val que4 = Question(
            4,
            "Select correct Japanese words with the same meaning of Korean words in brackets.",
            """
                지하철 (타지 않고) 걸어갈게요. 
                地下鉄に(___)、歩いていきますね。""",
                
                
            "乗って","乗らないで",
            2)
        questionsList.add(que4)
        //5
        val que5 = Question(
            5,
            "Select correct Japanese words with the same meaning of Korean words in brackets.",
            """
                도와주지 (못해서)죄송합니다. 
                お役に立て(___)すみません。""",

            "しまって","ずに",
            2)
        questionsList.add(que5)
        //6
        val que6 = Question(
            6,
            "Select correct Japanese words with the same meaning of Korean words in brackets.",
            """
                빨리 배달 왔(으면 좋겠는데). 
                早く配達が来(___)。""",
            "なくてもいい","たらいいのに",
            2)
        questionsList.add(que6)
        //7
        val que7 = Question(
            7,
            "Select correct Japanese words with the same meaning of Korean words in brackets. ",
            """
                시간이 없으니까 빨리 가(는 게 좋겠어요).
                時間がないので、急いで行っ(___)。""",
            "た方がいいですよ","てもいいですよ",
            1)
        questionsList.add(que7)
        //8
        val que8 = Question(
            8,
            "Select correct Japanese words with the same meaning of Korean words in brackets. ",
            """
                제가 여행중이라 조금만 마시(기로 했어요).
                私が旅行中なので、少しだけ飲む(___)。""",
            "ことがなかった","ことにしました",
            2)
        questionsList.add(que8)
        //9
        val que9 = Question(
            9,
            "Select correct Japanese words with the same meaning of Korean words in brackets. ",
            """
                지금부터 아이돌 콘서트에 (가려고요). 
                今から、アイドルのコンサートに(___)。""",
            "行く予定です","行きません",
            1)
        questionsList.add(que9)
        //10
        val que10 = Question(
            10,
            "Select correct Japanese words with the same meaning of Korean words in brackets.",
            """
                핸드폰을 (보면서) 걷지 마세요.
                携帯を(___)歩かないでください。""",
            "見ながら","持って",
            1)
        questionsList.add(que10)
        return questionsList
    }
}