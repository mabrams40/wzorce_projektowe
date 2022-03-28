package com.company.zadaniev3;

public class Computer{

    private Case pcCase;
    private PowerSupply powerSupply;
    private Motherboard motherboard;
    private Gpu gpu;
    private HardDrive hardDrive;
    private Ram ram;

    private double finalCost = 0;

    public Computer(Case pcCase, PowerSupply powerSupply, Motherboard motherboard, Gpu gpu, HardDrive hardDrive, Ram ram){
        this.pcCase = pcCase;
        this.powerSupply = powerSupply;
        this.motherboard = motherboard;
        this.gpu = gpu;
        this.hardDrive = hardDrive;
        this.ram = ram;
    }

    public double finalCost(Case pcCase, PowerSupply powerSupply, Motherboard motherboard, Gpu gpu, HardDrive hardDrive, Ram ram){
        finalCost += pcCase.Cost();
        finalCost += powerSupply.Cost();
        finalCost += motherboard.Cost();
        finalCost += gpu.Cost();
        finalCost += hardDrive.Cost();
        finalCost += ram.Cost();

        return finalCost;
    }
}
