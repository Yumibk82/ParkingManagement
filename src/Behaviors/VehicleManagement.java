package Behaviors;
import Entities.Bike;
import Entities.Car;
import Entities.Motor;
import Entities.Vehicle;
import java.util.ArrayList;
public class VehicleManagement<E extends Vehicle>implements IMethod<E>{
    ArrayList<E> vm;
    public VehicleManagement(){
        vm = (ArrayList<E>) ReadWriteFile.readFromFile(path);
    }
    String path = "C:\\Users\\Tuan\\IdeaProjects\\ParkingAreaManagement\\src\\DataBase.dat";
    @Override
    public void add(E addObj){
        vm.add(addObj);
        ReadWriteFile.writeObjectToFile(vm,path);

    }
    @Override
    public void remove(E removeObj){
        for (E e: vm) {
            if(e.getLicencePlate()==removeObj.getLicencePlate()){
                vm.remove(e);
            }
        }
        ReadWriteFile.writeObjectToFile(vm,path);
    }
    @Override
    public E search(int licencePlate){
//        vm = (ArrayList<E>) ReadWriteFile.readFromFile(path);
        for (E e: vm) {
            if(e.getLicencePlate()==licencePlate){
                return e;
            }
        }
        return null;
    }
    @Override
    public void update(E newObj,E oldObj){

        oldObj.setLicencePlate(newObj.getLicencePlate());
        oldObj.setName(newObj.getName());
        oldObj.setModel(newObj.getModel());
        oldObj.setColor(newObj.getColor());

        if(oldObj instanceof Car && newObj instanceof Car){
            ((Car) oldObj).setSafeDriveMode(((Car)newObj).getSafeDriveMode());
        }
        if(oldObj instanceof Motor && newObj instanceof Motor){
            ((Motor)oldObj).setTransmissionMode(((Motor)newObj).getTransmissionMode());
        }
        if(oldObj instanceof Bike && newObj instanceof Bike){
            ((Bike)oldObj).setPedalType(((Bike)newObj).getPedalType());
        }

    }
    @Override
    public void show(){
        vm = (ArrayList<E>) ReadWriteFile.readFromFile(path);
        for (E e: vm) {
            System.out.println(e.toString());
        }
    }

}
