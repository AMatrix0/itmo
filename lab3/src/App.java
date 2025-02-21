import enums.Task;
import exceptions.NotPermittedTaskException;
import items.Exercises;
import items.LearnableSubject;
import items.Phone;
import items.Promises;
import items.SwitchableItem;
import places.FilledPlace;
import places.RegularPlace;
import shorties.MasterShorty;
import shorties.RegularShortly;
import shorties.SlaveShorty;

public class App {
    public static void main(String[] args) {
        FilledPlace street = new FilledPlace("улицы города");
        FilledPlace homes = new FilledPlace("дома");
        RegularShortly shorties = new RegularShortly("Коротышки", "они", street);
        shorties.finishDoThing(Task.DO_ALL_THIS, false);
        shorties.selectSecondName();
        SwitchableItem lighting = new SwitchableItem("электрическое освещение");
        if (shorties.startDoThing(Task.MAKE_ELECTRIC_LIGHTING, true)) street.addItem(lighting);
        Phone phone = new Phone("телефон");
        if (shorties.justDoThing(Task.MAKE_PHONE_LINES, false, "чтобы можно было разговаривать, не выходя из " + homes.getName())) homes.addItem(phone);

        MasterShorty knower = new MasterShorty("Знайка", homes, Task.MAKE_TV);
        SlaveShorty vintik = new SlaveShorty("Винтик", homes, knower);
        // vintik.unlockNextAction();
        SlaveShorty shpuntik = new SlaveShorty("Шпунтик", homes, knower);
        try {
            // if (vintik.justDoThing(Task.MAKE_LIGHTING, false, "чтобы смотреть дома кинокартины и театральные представления") &&
            SwitchableItem tv = new SwitchableItem("телевизор");
            if (vintik.justDoThing(Task.MAKE_TV, false, "чтобы смотреть дома кинокартины и театральные представления") &&
            shpuntik.justDoThing(Task.MAKE_TV, false, "чтобы смотреть дома кинокартины и театральные представления")) homes.addItem(tv);
        }
        catch (NotPermittedTaskException e) {
            System.out.println("Произошла ошибка при попытке создать телевизор: " + e);
        }

        FilledPlace head = new FilledPlace("голова незнайки");
        RegularShortly stupid = new RegularShortly("Незнайка", "он", "герой", homes);
        stupid.justDoThing(Task.GOT_SMARTER, false);
        stupid.selectSecondName();
        stupid.startDoThing(Task.LEARN_TO_READ, false);
        stupid.startDoThing(Task.LEARN_TO_WRITE, false);
        stupid.selectThirdName();
        LearnableSubject grammar = new LearnableSubject("грамматика");
        if (stupid.finishDoThing(Task.READ_GRAMMAR, false)) head.addItem(grammar);
        LearnableSubject algebra = new LearnableSubject("арифметика");
        if (stupid.finishDoThing(Task.READ_ALGEBRA, false)) head.addItem(algebra);
        stupid.selectSecondName();
        Exercises exercises = new Exercises("задачки");
        if (stupid.startDoThing(Task.DO_EXERCISES, false)) head.addItem(exercises);
        stupid.startDoThing(Task.WANT_TO_LEARN_PHYSICS, false, "которую называл физикой-мизикой");
        stupid.selectFirstName();
        stupid.finishDoThing(Task.WANT_TO_LEARN, false);

        shorties.selectFirstName();
        RegularPlace country = new RegularPlace("страна коротышек");
        shorties.setLocation(country);
        shorties.finishDoThing(Task.WANT_TO_LEARN, true, "часто");
        
        FilledPlace new_head = new FilledPlace("голова коротышки");
        RegularShortly another = new RegularShortly("иной коротышка", "он", country);
        Promises promises = new Promises("обещания");
        if (another.justDoThing(Task.PROMISE_A_LOT, false)) new_head.addItem(promises);
        another.justDoThing(Task.DO_A_LOT, false);
        another.selectSecondName();
        another.justDoThing(Task.WORK_FULLY, false, "несколько дней");
        another.finishDoThing(Task.WORK_FULLY, false, "понемножку");

    }
}
