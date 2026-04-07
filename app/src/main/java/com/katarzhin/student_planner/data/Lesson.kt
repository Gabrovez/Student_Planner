package com.katarzhin.student_planner.data

data class Lesson(
    val id: String,
    val dayOfWeek: String,
    val time: String,
    val subjectName: String,
    val type: String,
    val classroom: String,
    val professor: String,
)

val sampleSchedule = listOf(

    // Вторник
    Lesson(
        id = "21",
        dayOfWeek = "Вторник",
        time = "10:10 - 11:40",
        subjectName = "Системное программирование",
        type = "Лекция",
        classroom = "2-20",
        professor = "Токаев Т.И."
    ),
    Lesson(
        id = "22",
        dayOfWeek = "Вторник",
        time = "12:10 - 13:40",
        subjectName = "Системное программирование",
        type = "Лаба",
        classroom = "3-03",
        professor = "Токаев Т.И."
    ),
    Lesson(
        id = "23",
        dayOfWeek = "Вторник",
        time = "13:50 - 15:20",
        subjectName = "Инструментальные средства разработки программного обеспечения",
        type = "Лаба",
        classroom = "1-02",
        professor = "Леонтьев Д.А"
    ),
    Lesson(
        id = "24",
        dayOfWeek = "Вторник",
        time = "15:30 - 17:00",
        subjectName = "Разработка мобильных приложений",
        type = "Лаба",
        classroom = "1-02",
        professor = "Леонтьев Д.А"
    ),

    // Среда
    Lesson(
        id = "31",
        dayOfWeek = "Среда",
        time = "8:30 - 10:00",
        subjectName = "Разработка мобильных приложений",
        type = "Лаба",
        classroom = "1-02",
        professor = "Леонтьев Д.А"
    ),
    Lesson(
        id = "32",
        dayOfWeek = "Среда",
        time = "10:10 - 11:40",
        subjectName = "Разработка программных модулей",
        type = "Лаба",
        classroom = "3-03",
        professor = "Донскова Д.А."
    ),
    Lesson(
        id = "33",
        dayOfWeek = "Среда",
        time = "12:10 - 13:40",
        subjectName = "Разработка программных модулей",
        type = "Лекция",
        classroom = "Актовый зал",
        professor = "Донскова Д.А."
    ),

    // Четверг
    Lesson(
        id = "41",
        dayOfWeek = "Четверг",
        time = "08:30 - 10:00",
        subjectName = "Менеджмент в проф. деятельности",
        type = "Лекция",
        classroom = "3-02",
        professor = "Запорожская С.А."
    ),
    Lesson(
        id = "42",
        dayOfWeek = "Четверг",
        time = "10:10 - 11:40",
        subjectName = "Математическое моделирование",
        type = "Лекция",
        classroom = "Актовый зал",
        professor = "Трошина О.В."
    ),
    Lesson(
        id = "43",
        dayOfWeek = "Четверг",
        time = "12:10 - 13:40",
        subjectName = "Иностранный язык в проф. деятельности",
        type = "Практика",
        classroom = "2-22",
        professor = "Пенькова О.В."
    ),
    Lesson(
        id = "44",
        dayOfWeek = "Четверг",
        time = "13:50 - 15:20",
        subjectName = "Обеспечение качества функционирования компьютерных систем",
        type = "Лаба",
        classroom = "3-12",
        professor = "Ушакова М.А"
    ),

    // Пятница
    Lesson(
        id = "51",
        dayOfWeek = "Пятница",
        time = "08:30 - 10:00",
        subjectName = "Инструментальные средства разработки ПО",
        type = "Лаба",
        classroom = "1-02",
        professor = "Леонтьев Д.А."
    ),
    Lesson(
        id = "52",
        dayOfWeek = "Пятница",
        time = "10:10 - 11:40",
        subjectName = "Управление проектами",
        type = "Лаба",
        classroom = "1-02",
        professor = "Трошина О.В."
    ),
    Lesson(
        id = "53",
        dayOfWeek = "Пятница",
        time = "12:10 - 13:40",
        subjectName = "Управление проектами",
        type = "Лекция",
        classroom = "Актовый зал",
        professor = "Трошина О.В."
    ),
)