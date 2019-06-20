package com.threadDemo;

/**
 * 军队线程
 */
public class ArmyRunnable implements Runnable{

    public static void main(String[] args) {
        ArmyRunnable armyTaskOfSuiDynasty = new ArmyRunnable();
        ArmyRunnable armyTaskOfarmyOfRevokt = new ArmyRunnable();


        //使用接口 创建线程

        Thread armyOfSuiDynasty = new Thread(armyTaskOfSuiDynasty,"隋军");
        Thread armyOfarmyOfRevokt = new Thread(armyTaskOfarmyOfRevokt,"农民起义军");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    @Override
    public void run() {

    }
}
