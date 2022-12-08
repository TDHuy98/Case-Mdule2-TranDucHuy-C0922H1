package ReadAndWriteFile;

import combineAccountsAndStaffs.ListStaffs;
import combineAccountsAndStaffs.Staff;
import java.io.*;
import java.util.List;

public class ReadAndWriteStaffdata {
    public static void writeToFile() {
        try {
            FileOutputStream writeData = new FileOutputStream("staffdata.ser");
            ObjectOutputStream writeStream = new ObjectOutputStream(writeData);

            writeStream.writeObject(ListStaffs.StaffsOriginal);
            writeStream.flush();
            writeStream.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static List<Staff> read() throws IOException, ClassNotFoundException {
        ObjectInputStream readStream = null;
        List<Staff> StaffsList2 = null;
        try {
            FileInputStream readData = new FileInputStream("staffdata.ser");
            readStream = new ObjectInputStream(readData);

            StaffsList2 = (List<Staff>) readStream.readObject();
            readStream.close();
            System.out.println("Đọc file staffdata thành công");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return StaffsList2;
    }
//    static String url = "StaffsList.txt";
//
//    public static void createFile(String file, List<Staff> arrData)
//            throws IOException {
//        FileWriter writer = new FileWriter(StaffsList + ".txt");
//        int size = arrData.size();
//        for (int i=0;i<size;i++) {
//            String str = arrData.get(i).toString();
//            writer.write(str);
//            if(i < size-1)//This prevent creating a blank like at the end of the file**
//            writer.write("\n");
//        }
//        writer.close();
//    }
//    public static void write(List<Staff> ListStaff){
//        try {
//            FileOutputStream fileOutputStream = new FileOutputStream(url);
//            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
//            objectOutputStream.writeObject(ListStaff);
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }
//
//    public static List<Staff> read(){
//        try {
//            FileInputStream fileInputStream = new FileInputStream(url);
//            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
//            return (List<Staff>) objectInputStream.readObject();
//        } catch (Exception e) {
//            e.printStackTrace();
//            return new ArrayList<>();
//        }
}
