package oop.seminars.s05.mvcstudentapp.model;

import oop.seminars.s05.mvcstudentapp.controller.Commands;
import oop.seminars.s05.mvcstudentapp.controller.iGetView;
import oop.seminars.s05.mvcstudentapp.view.RIP_ViewEng;
import oop.seminars.s05.mvcstudentapp.view.RIP_ViewRu;

import java.util.Map;

public class MenuModel {
    public MenuModel() {
    }

    /**
     * Let user to choice the menu language
     * @param choice String parameter
     * @return instance of Menu
     */
    public iGetView getLanguage(String choice){
        if (choice.equals("1")) {
            return new RIP_ViewEng();
        }
        else return new RIP_ViewRu();//default language
    }

    /**
     * Create a menu instances by choice language
     * @param languageChoice Number of languages, supported by program
     * @return Menu items in languages
     */
    //TODO drop languages into a file
    public Language getMenuByLanguageIdentifier(int languageChoice){
        switch (languageChoice){
            case 2:
                Language languageRu =  new Language(Language.getSupportedLanguages().get(languageChoice));
                languageRu.addTranslation(Commands.ACTIONS, "Доступные действия");
                languageRu.addTranslation(Commands.CREATE, "Создать студента");
                languageRu.addTranslation(Commands.LIST, "Показать список студентов");
                languageRu.addTranslation(Commands.DELETE, "Исключить студента из списка");
                languageRu.addTranslation(Commands.EXIT, "Выход из программы");
                return languageRu;
            default:
                Language languageEng =  new Language(Language.getSupportedLanguages().get(languageChoice));
                languageEng.addTranslation(Commands.ACTIONS, "Available actions:");
                languageEng.addTranslation(Commands.CREATE, "Create a new person");
                languageEng.addTranslation(Commands.LIST, "Show this list of students");
                languageEng.addTranslation(Commands.DELETE, "Delete certain person by index");
                languageEng.addTranslation(Commands.EXIT, "Exit the program");
                return languageEng;
        }
    }

    public void showMenu(Language menu){
        System.out.println("---------" + menu.getTranslatedLabel(Commands.ACTIONS) + "-------------");
        for (Map.Entry obj: menu.getWholeTranslatedMenu().entrySet()) {
            System.out.printf("\n %s \t %s",obj.getKey(),obj.getValue());
        }
    }


}
