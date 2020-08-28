package com.company.car.view;

import java.util.Scanner;

public class AppUi {

    public static int enterWhatWheelChange() {

        boolean flag;
        int selectNum;
        do {
            System.out.println("Выбирете какое колесо заменить");
            Scanner num = new Scanner(System.in);
            selectNum = num.nextInt();
            if (selectNum > 5 || selectNum < 1) {
                flag = false;
                System.out.println("Выберете колесо еще раз");
            } else {
                flag = true;
            }
        } while (flag = false);
        return selectNum;
    }
}
