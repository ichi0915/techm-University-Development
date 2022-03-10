package Ejercicio3;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main extends JFrame{
    private JPanel mainPanel;
    private JButton btnOnOffCar;
    private JButton btnOnOffBoat;
    private JButton btnReset;
    private JTextArea textArea1;
    private JButton btnOnOffAirplane;
    private JButton btnAccelerateAirplane;
    private JButton btnBrakeAirplane;
    private JButton btnAccelerateCar;
    private JButton btnBrakeCar;
    private JButton btnAccelerateBoat;
    private JButton btnBrakeBoat;
    private JButton btnCheck;
    private JButton btnRefuelAirplane;
    private JButton btnRefuelBoat;
    private JButton btnRefuelCar;
    private JButton btnLand;
    private JButton btnDock;
    private JButton btnCheckCar;
    private JButton btnCheckBoat;
    private JTextArea textArea2;

    public static void main (String[]args){
        JFrame frame = new Main();
        frame.setVisible(true);
        Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
        int x = (int) ((dimension.getWidth() - frame.getWidth()) / 2);
        int y = (int) ((dimension.getHeight() - frame.getHeight()) / 2);
        frame.setLocation(x, y);
    }
    public Main() {

        textArea1.setMinimumSize(new Dimension(300,500));
        textArea1.setMaximumSize(new Dimension(300,600));
        this.setContentPane(mainPanel);
        this.pack();
        this.setTitle("Exercise 3");

        Airplane avion = new Airplane();
        avion.maxGas=80;
        avion.maxSpeed=120;
        Boat bote = new Boat();
        bote.maxGas=70;
        bote.maxSpeed=110;
        Car carro = new Car();
        carro.maxGas=60;
        carro.maxSpeed=100;
        btnOnOffAirplane.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                printMessage("Airplane",onVal(avion), textArea1);
            }
        });
        btnRefuelAirplane.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                printMessage("Airplane",refuelVal(avion,10), textArea1);
            }
        });
        btnAccelerateAirplane.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                printMessage("Airplane",accelerateVal(avion), textArea1);
            }
        });
        btnLand.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                printMessage("Airplane",landVal(avion), textArea1);
            }
        });
        btnBrakeAirplane.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                printMessage("Airplane",brakeVal(avion,5), textArea1);
            }
        });
        btnReset.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textArea1.setText("");
                textArea2.setText("");
            }
        });
        btnCheck.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                printMessage("Airplane",getValues(avion), textArea2);
                textArea2.setText(textArea2.getText()+"\n--------------------------");
            }
        });
        btnCheckBoat.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                printMessage("Boat",getValues(bote), textArea2);
                textArea2.setText(textArea2.getText()+"\n--------------------------");
            }
        });
        btnCheckCar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                printMessage("Car",getValues(carro), textArea2);
                textArea2.setText(textArea2.getText()+"\n--------------------------");
            }
        });
        btnAccelerateBoat.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                printMessage("Boat",accelerateVal(bote), textArea1);
            }
        });
        btnBrakeBoat.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                printMessage("Boat",brakeVal(bote,4), textArea1);
            }
        });
        btnRefuelBoat.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                printMessage("Boat",refuelVal(bote,8), textArea1);
            }
        });
        btnDock.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                printMessage("Boat",dockVal(bote), textArea1);
            }
        });
        btnAccelerateCar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                printMessage("Car",accelerateVal(carro), textArea1);
            }
        });
        btnBrakeCar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                printMessage("Car",brakeVal(carro,2), textArea1);
            }
        });
        btnRefuelCar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                printMessage("Car",refuelVal(carro,4), textArea1);
            }
        });
        btnOnOffCar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                printMessage("Car",onVal(carro), textArea1);
            }
        });
        btnOnOffBoat.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                printMessage("Boat",onVal(bote), textArea1);
            }
        });
    }

    public void printMessage(String vehiculo, String status, JTextArea textArea){
        textArea.setText(textArea.getText()+"\n"+vehiculo+" "+status);
    }
    public String onVal(Airplane vehicle){
        String status;
        if (vehicle.isOn == false&&vehicle.isLanded()) {
            if(vehicle.gas>0){
                vehicle.turnOn();
                vehicle.setLanded(false);
                vehicle.gas-=5;
                status="on";
            }else{
                status="without gas.";
            }
        } else {
            if(vehicle.speed==0){
                vehicle.turnOff();
                status="off";
            }else{
                status="with speed. Can't turn off.";
            }
        }
        return status;
    }
    public String onVal(Car vehicle){
        String status;
        if (vehicle.isOn == false) {
            if(vehicle.gas>0){
                vehicle.turnOn();
                vehicle.gas-=2;
                status="on";
            }else{
                status="without gas.";
            }
        } else {
            if(vehicle.speed==0){
                vehicle.turnOff();
                status="off";
            }else{
                status="with speed. Can't turn off.";
            }
        }
        return status;
    }
    public String onVal(Boat vehicle){
        String status;
        if (vehicle.isOn == false&&vehicle.isDocked()) {
            if(vehicle.gas>0){
                vehicle.turnOn();
                vehicle.setDocked(false);
                vehicle.gas-=4;
                status="on";
            }else{
                status="without gas.";
            }
        } else {
            if(vehicle.speed==0&&vehicle.isDocked()){
                vehicle.turnOff();
                vehicle.setDocked(true);
                status="off";
            }else{
                status="with speed. Can't turn off.";
            }
        }
        return status;
    }
    public String refuelVal(Vehicle vehicle, int amount){
        String status;
        if(!vehicle.isOn){
            if(vehicle.maxGas>vehicle.gas){
                vehicle.refuel(amount);
                status="charged with "+amount+" units of fuel.";
            }else{
                status="can't charge more fuel due to the max gas limit.\n"+
                        "MaxGas: "+vehicle.maxGas+"Actual Gas: "+vehicle.gas;
            }
        }else{
            status=" can't refuel bc it's on.";
        }
        return status;
    }
    public String accelerateVal(Airplane vehicle){
        String status;
        if(vehicle.isOn&&vehicle.gas>0&&!vehicle.isLanded()){
            vehicle.accelerate();
            vehicle.gas-=5;
            status=" accelerated 5 units.";
        }else{
            if(!vehicle.isOn){
                status="can't accelerate bc it's off.";
            }else if(vehicle.gas==0){
                status="can't accelerate bc it's run out of gas.";
            }else{
                status="can't accelerate bc it's landed.";
            }
        }
        return status;
    }
    public String accelerateVal(Boat vehicle){
        String status;
        if(vehicle.isOn&&vehicle.gas>0&&!vehicle.isDocked()){
            vehicle.accelerate();
            vehicle.gas-=4;
            status=" accelerated 4 units.";
        }else{
            if(!vehicle.isOn){
                status="can't accelerate bc it's off.";
            }else if(vehicle.gas==0){
                status="can't accelerate bc it's run out of gas.";
            }else{
                status="can't accelerate bc it's docked.";
            }
        }
        return status;
    }
    public String accelerateVal(Car vehicle){
        String status;
        if(vehicle.isOn&&vehicle.gas>0){
            vehicle.accelerate();
            vehicle.gas-=2;
            status=" accelerated 2 units.";
        }else{
            if(!vehicle.isOn){
                status="can't accelerate bc it's off.";
            }else{
                status="can't accelerate bc it's run out of gas.";
            }
        }
        return status;
    }
    public String landVal(Airplane vehicle){
        String status;
        if(vehicle.getSpeed()==0){
            vehicle.setLanded(true);
            status="landed.";
        }else{
            status="can't land bc the airplane has speed.";
        }
        return status;
    }
    public String dockVal(Boat vehicle){
        String status;
        if(vehicle.getSpeed()==0){
            vehicle.setDocked(true);
            status="docked.";
        }else{
            status="can't dock bc the boat has speed.";
        }
        return status;
    }
    public String brakeVal(Vehicle vehicle, int reduce){
        String status;
        if(vehicle.isOn&&vehicle.speed!=0){
            vehicle.brake();
            status="has reduced his speed "+reduce+" units";
        }else if(!vehicle.isOn){
            status="can't reduce speed bc it's off.";
        }else{
            status="can't reduce speed bc it's speed is 0.";
        }
        return status;
    }
    public String getValues(Airplane vehicle){
        String status;
        status="values,\nis "+(vehicle.isOn==true?"on":"off")+"\nspeed: "+(vehicle.getSpeed()==null?"0":vehicle.getSpeed())+
                "\ngas: "+vehicle.gas+"\nis landed? "+(vehicle.isLanded()==true?"yes":"no");
        return status;
    }
    public String getValues(Boat vehicle){
        String status;
        status="values,\nis "+(vehicle.isOn==true?"on":"off")+"\nspeed: "+(vehicle.getSpeed()==null?"0":vehicle.getSpeed())+
                "\ngas: "+vehicle.gas+"\nis docked? "+(vehicle.isDocked()==true?"yes":"no");
        return status;
    }
    public String getValues(Car vehicle){
        String status;
        status="values,\nis "+(vehicle.isOn==true?"on":"off")+"\nspeed: "+(vehicle.getSpeed()==null?"0":vehicle.getSpeed())+
                "\ngas: "+vehicle.gas;
        return status;
    }
}
