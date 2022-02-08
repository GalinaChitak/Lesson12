package com.galinachitakV;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	/*1) Есть игра в которой клетчастое поле (например размером 10x10 клеток) и юниты,
	 в одной клетке один юнит.
	 Есть 4 типа юнитов: башня, забор, содат и танк.
	 Забор ничего не делает и может быть разрушен
	 Башня ничего не делает и безсмертна
	 Солдат стреляет и двигается - у него можно вызвать методы move() и fire()
	 Танк умеет то же что и солдат, плюс еще у него есть метод reload()
	 Создать классы которые соотвествует каждому юниту и использовать extends если
	 это целесообразно. Может быть больше классов чем перечилено в задаче если нужно.
	 Создать список в котором есть юниты всех типов.*/
        List<Units> unitss = new ArrayList<>();
        unitss.add(new Fence(1, 2));
        unitss.add(new Tower(2, 5));
        Soldier soldier = new Soldier(3, 6);
        unitss.add(soldier);
        Tank tank = new Tank(6, 9);
        unitss.add(tank);


        soldier.fire();
        soldier.move();

        tank.fire();
        tank.move();
        tank.reload();

        for (Units units : unitss) {
            System.out.println(units);
        }

    }
}
