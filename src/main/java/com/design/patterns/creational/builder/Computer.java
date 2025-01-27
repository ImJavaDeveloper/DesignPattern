package com.design.patterns.creational.builder;

public class Computer {

    private String companyName;
    private String machineType;
    private String CPU;
    private String RAM;
    private String storage;

    @Override
    public String toString() {
        return "Computer{" +
                "companyName='" + companyName + '\'' +
                ", machineType='" + machineType + '\'' +
                ", CPU='" + CPU + '\'' +
                ", RAM='" + RAM + '\'' +
                ", storage='" + storage + '\'' +
                '}';
    }



    private Computer(ComputerBuilder computerBuilder)
    {
      this.companyName=computerBuilder.companyName;
      this.machineType=computerBuilder.machineType;
      this.CPU=computerBuilder.CPU;
      this.RAM=computerBuilder.RAM;
      this.storage=computerBuilder.storage;
    }

    public static class  ComputerBuilder
    {
        private String companyName;
        private String machineType;
        private String CPU;
        private String RAM;
        private String storage;

        public ComputerBuilder companyName(String companyName)
        {
            this.companyName=companyName;
            return this;
        }
        public ComputerBuilder machineType(String machineType)
        {
            this.machineType=machineType;
            return this;
        }
        public ComputerBuilder CPU(String CPU)
        {
            this.CPU=CPU;
            return this;
        }
        public ComputerBuilder RAM(String RAM)
        {
            this.RAM=RAM;
            return this;
        }
        public ComputerBuilder storage(String storage)
        {
            this.storage=storage;
            return this;
        }

        public Computer build()
        {
            return new Computer(this);
        }
    }

}
