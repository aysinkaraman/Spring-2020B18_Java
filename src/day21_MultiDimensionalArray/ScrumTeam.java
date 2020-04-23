package day21_MultiDimensionalArray;

public class ScrumTeam {
    public static void main(String[] args) {
        String [] DevTeam = {"Aysin", "Tuba", "Neslihan"};
        String [] Testers = {"Betul", "Rana", "Nurbanu", "Beyza"};
        String [][] ScrumTeam = {DevTeam, Testers};
        System.out.println(ScrumTeam[0][2]);
        String info = ScrumTeam[1][2];
        System.out.println(info);
        System.out.println("============================================");
        for (String eachEmployee : ScrumTeam[1]) {
            System.out.println(eachEmployee);
        }

    }
}
