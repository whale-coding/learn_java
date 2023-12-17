package override.exer1;

/**
 * @Date 2023-12-15 20:43 星期五
 * @Author: 聂建强
 * @Description:
 */
public class Kids extends ManKind {

    private int yearsOld;

    public Kids(){

    }

    public Kids(int yearsOld){
        this.yearsOld = yearsOld;
    }

    public Kids(int sex, int salary,int yearsOld){
        this.yearsOld = yearsOld;
        setSex(sex);
        setSalary(salary);
    }


    public int getYearsOld() {
        return yearsOld;
    }

    public void setYearsOld(int yearsOld) {
        this.yearsOld = yearsOld;
    }

    public void printAge(){
        System.out.println("I am " + yearsOld + " years old.");
    }

    @Override
    public void employeed() {
        System.out.println("Kids should study and no job.");
    }
}
