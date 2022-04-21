package com.company;

public class HouseBuilderFacade {
    public static final String GREEN_BOLD_BRIGHT = "\033[1;92m";
    public static final String ANSI_RESET = "\u001B[0m";

    Architect architect = new Architect();
    Builders builders = new Builders();
    Installers installers = new Installers();
    MastersFinishingWorks mastersFinishingWorks = new MastersFinishingWorks();

    void buildHouse(){
        architect.makeProject();
        architect.developDesign();
        builders.layFoundation();
        builders.buildWalls();
        builders.buildRoof();
        installers.installWindowsDoors();
        mastersFinishingWorks.doFinishingWork();

        System.out.println(GREEN_BOLD_BRIGHT + "\nДом построен !!!"  + ANSI_RESET);
    }

}
