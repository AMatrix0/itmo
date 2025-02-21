package enums;

public enum Task {
    MAKE_ELECTRIC_LIGHTING("проводить электрическое освещение"),
    MAKE_PHONE_LINES("устроить телефон"),
    MAKE_TV("телевизор"),
    GOT_SMARTER("поумнел"),
    LEARN_TO_READ("учиться читать"),
    LEARN_TO_WRITE("учиться писать"),
    READ_GRAMMAR("читать грамматику"),
    READ_ALGEBRA("читать арифметику"),
    DO_EXERCISES("задачки"),
    WANT_TO_LEARN_PHYSICS("хотеть изучать физику"),
    PROMISE_A_LOT("наобещает с три короба"),
    DO_A_LOT("сказал, что сделает то и это, и горы свернёт"),
    WORK_FULLY("работать в полную силу"),
    WANT_TO_LEARN("хотеть учится"),
    DO_ALL_THIS("всё это");

    private final String text;

    Task(String text) {
        this.text = text;
    }


    public String getText() {
        return this.text;
    }
}
