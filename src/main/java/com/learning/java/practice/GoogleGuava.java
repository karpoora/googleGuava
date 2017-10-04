package com.learning.java.practice;

import com.learning.java.model.Address;
import com.learning.java.model.College;
import com.learning.java.model.Department;
import com.learning.java.model.Designation;
import com.learning.java.model.Gender;
import com.learning.java.model.Role;
import com.learning.java.model.Semester;
import com.learning.java.model.SemesterName;
import com.learning.java.model.Staff;
import com.learning.java.model.Student;
import com.learning.java.model.Subject;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.joda.time.DateTime;

/**
 * Created by krvh271 on 8/15/17.
 */
public class GoogleGuava {
    public static void main(String arg[]) throws MalformedURLException {
        GoogleGuava googleGuava = new GoogleGuava();
        googleGuava.createCollege();
    }

    void createCollege() throws MalformedURLException {
        College college = new College();
        college.setName("Kumaraguru College Of Technology");
        college.setAddress(fillAddress());
        college.setWebsite(new URL("www.kct.com"));
        college.setDepartmentList(createDepartments());
    }

    private List<Department> createDepartments() {
        List<Department> departmentList=new ArrayList<>();
        Department biologyDepartment = createBiologyDepartment();
        departmentList.add(biologyDepartment);
        Department mathsDepartment = createMathsDepartment();
        departmentList.add(mathsDepartment);
        Department chemistryDepartment = createChemistryDepartment();
        departmentList.add(chemistryDepartment);
        Department physicsDepartment = createPhysicsDepartment();
        departmentList.add(physicsDepartment);
        Department historyDepartment = createHistoryDepartment();
        departmentList.add(historyDepartment);
        Department geographyDepartment = createGeographyDepartment();
        departmentList.add(geographyDepartment);

        return departmentList;
    }

    private Department createMathsDepartment() {
        Department mathsDepartment= new Department();
        return mathsDepartment;
    }

    private Department createChemistryDepartment() {
        Department chemistryDepartment= new Department();
        return chemistryDepartment;
    }

    private Department createPhysicsDepartment() {
        Department physicsDepartment= new Department();
        return physicsDepartment;
    }

    private Department createHistoryDepartment() {
        Department historyDepartment= new Department();
        return historyDepartment;
    }

    private Department createGeographyDepartment() {
        Department geographyDepartment= new Department();
        return geographyDepartment;
    }

    private Department createBiologyDepartment() {
        Department biologyDepartment= new Department();
        biologyDepartment.setName("Biology");
        biologyDepartment.setSemesterSubjectMapList(createSemesterBiologySubjects());
        biologyDepartment.setStaffList(createBiologyStaffs(biologyDepartment));
        biologyDepartment.setStudentList(createStudentList());
        return biologyDepartment;
    }

    private List<Student> createStudentList() {
        List<Student> studentList=new ArrayList<>();

        return studentList;
    }

    private List<Map<Semester,List<Subject>>> createSemesterBiologySubjects() {
        List<Map<Semester,List<Subject>>> semesterSubjects=new ArrayList<>();

        Map<Semester,List<Subject>> Odd2001SubjectMap = new HashMap<>();
        Semester semester2001Odd=new Semester();
        semester2001Odd.setEducationalYear("2001");
        semester2001Odd.setName(SemesterName.ODD);
        List<Subject> semester2001OddSubjects= new ArrayList<>();
        semester2001OddSubjects.add(new Subject("BiologySub2001Odd","00001"));
        semester2001OddSubjects.add(new Subject("BiologySub2001Odd","00002"));
        semester2001OddSubjects.add(new Subject("BiologySub2001Odd","00003"));
        semester2001OddSubjects.add(new Subject("BiologySub2001Odd","00004"));
        semester2001OddSubjects.add(new Subject("BiologySub2001Odd","00005"));
        Odd2001SubjectMap.put(semester2001Odd,semester2001OddSubjects);
        semesterSubjects.add(Odd2001SubjectMap);

        Map<Semester,List<Subject>> even2001SubjectMap = new HashMap<>();
        Semester semester2001even=new Semester();
        semester2001even.setEducationalYear("2001");
        semester2001even.setName(SemesterName.EVEN);
        List<Subject> semester2001evenSubjects= new ArrayList<>();
        semester2001evenSubjects.add(new Subject("BiologySub2001even","00006"));
        semester2001evenSubjects.add(new Subject("BiologySub2001even","00007"));
        semester2001evenSubjects.add(new Subject("BiologySub2001even","00008"));
        semester2001evenSubjects.add(new Subject("BiologySub2001even","00009"));
        semester2001evenSubjects.add(new Subject("BiologySub2001even","00010"));
        even2001SubjectMap.put(semester2001even,semester2001evenSubjects);
        semesterSubjects.add(even2001SubjectMap);

        Map<Semester,List<Subject>> Odd2002SubjectMap = new HashMap<>();
        Semester semester2002Odd=new Semester();
        semester2002Odd.setEducationalYear("2002");
        semester2002Odd.setName(SemesterName.ODD);
        List<Subject> semester2002OddSubjects= new ArrayList<>();
        semester2002OddSubjects.add(new Subject("BiologySub2002Odd","00011"));
        semester2002OddSubjects.add(new Subject("BiologySub2002Odd","00012"));
        semester2002OddSubjects.add(new Subject("BiologySub2002Odd","00013"));
        semester2002OddSubjects.add(new Subject("BiologySub2002Odd","00014"));
        semester2002OddSubjects.add(new Subject("BiologySub2002Odd","00015"));
        Odd2002SubjectMap.put(semester2002Odd,semester2002OddSubjects);
        semesterSubjects.add(Odd2002SubjectMap);

        Map<Semester,List<Subject>> Even2002SubjectMap = new HashMap<>();
        Semester semester2002Even=new Semester();
        semester2002Even.setEducationalYear("2002");
        semester2002Even.setName(SemesterName.EVEN);
        List<Subject> semester2002EvenSubjects= new ArrayList<>();
        semester2002EvenSubjects.add(new Subject("BiologySub2002Even","00016"));
        semester2002EvenSubjects.add(new Subject("BiologySub2002Even","00017"));
        semester2002EvenSubjects.add(new Subject("BiologySub2002Even","00018"));
        semester2002EvenSubjects.add(new Subject("BiologySub2002Even","00019"));
        semester2002EvenSubjects.add(new Subject("BiologySub2002Even","00020"));
        Even2002SubjectMap.put(semester2002Even,semester2002EvenSubjects);
        semesterSubjects.add(Even2002SubjectMap);

        Map<Semester,List<Subject>> Odd2003SubjectMap = new HashMap<>();
        Semester semester2003Odd=new Semester();
        semester2003Odd.setEducationalYear("2003");
        semester2003Odd.setName(SemesterName.ODD);
        List<Subject> semester2003OddSubjects= new ArrayList<>();
        semester2003OddSubjects.add(new Subject("BiologySub2003Odd","00021"));
        semester2003OddSubjects.add(new Subject("BiologySub2003Odd","00022"));
        semester2003OddSubjects.add(new Subject("BiologySub2003Odd","00023"));
        semester2003OddSubjects.add(new Subject("BiologySub2003Odd","00024"));
        semester2003OddSubjects.add(new Subject("BiologySub2003Odd","00025"));
        Odd2003SubjectMap.put(semester2003Odd,semester2003OddSubjects);
        semesterSubjects.add(Odd2003SubjectMap);

        Map<Semester,List<Subject>> Even2003SubjectMap = new HashMap<>();
        Semester semester2003Even=new Semester();
        semester2003Even.setEducationalYear("2003");
        semester2003Even.setName(SemesterName.EVEN);
        List<Subject> semester2003EvenSubjects= new ArrayList<>();
        semester2003EvenSubjects.add(new Subject("BiologySub2003Even","00026"));
        semester2003EvenSubjects.add(new Subject("BiologySub2003Even","00027"));
        semester2003EvenSubjects.add(new Subject("BiologySub2003Even","00028"));
        semester2003EvenSubjects.add(new Subject("BiologySub2003Even","00029"));
        semester2003EvenSubjects.add(new Subject("BiologySub2003Even","00030"));
        Even2003SubjectMap.put(semester2003Even,semester2003EvenSubjects);
        semesterSubjects.add(Even2003SubjectMap);

        return semesterSubjects;
    }

    private Address fillAddress() {
        Address address = new Address();
        address.setFlat("plot 4A");
        address.setStreet("RajaRajeswari nagar");
        address.setArea("Chinnavedampatty");
        address.setCity("Coimbatore");
        address.setState("Tamilnadu");
        address.setCounty("India");
        address.setCode("603103");
        return address;
    }

    private List<Staff> createBiologyStaffs(Department department){
        List<Staff> biologyStaffs=new ArrayList<>();

        Staff staff1=new Staff();
        staff1.setSalary(25000L);
        staff1.setName("biology1");
        staff1.setGender(Gender.MALE);
        staff1.setEmail("biologystaff1@kct.com");
        staff1.setDepartment(department);
        staff1.setDob(DateTime.parse("22/01/1981"));
        staff1.setDoj(DateTime.parse("22/01/2001"));
        staff1.setContactNo("9962506071");
        staff1.setRole(Role.LECTURER);
        staff1.setDesignation(Designation.STAFF);
        staff1.setBoardMember(true);
        Address staff1Address =new Address();
        staff1Address.setStreet("Biology street 1");
        staff1Address.setCode("600071");
        staff1Address.setState("Tamilnadu");
        staff1Address.setCounty("India");
        staff1Address.setCity("chennai");
        staff1Address.setFlat("Biology flat 1");
        staff1.setAddress(staff1Address);
        biologyStaffs.add(staff1);

        Staff staff2=new Staff();
        staff2.setSalary(25000L);
        staff2.setName("biology2");
        staff2.setGender(Gender.FEMALE);
        staff2.setEmail("biologystaff2@kct.com");
        staff2.setDepartment(department);
        staff2.setDob(DateTime.parse("22/01/1982"));
        staff2.setDoj(DateTime.parse("22/01/2002"));
        staff2.setContactNo("9962506072");
        staff2.setRole(Role.SENIOR_LECTURER);
        staff2.setDesignation(Designation.STAFF);
        staff2.setBoardMember(false);
        Address staff2Address =new Address();
        staff2Address.setStreet("Biology street 2");
        staff2Address.setCode("600072");
        staff2Address.setState("Tamilnadu");
        staff2Address.setCounty("India");
        staff2Address.setCity("chennai");
        staff2Address.setFlat("Biology flat 2");
        staff2.setAddress(staff2Address);
        biologyStaffs.add(staff2);

        Staff staff3=new Staff();
        staff3.setSalary(25000L);
        staff3.setName("biology3");
        staff3.setGender(Gender.MALE);
        staff3.setEmail("biologystaff3@kct.com");
        staff3.setDepartment(department);
        staff3.setDob(DateTime.parse("22/01/1983"));
        staff3.setDoj(DateTime.parse("22/01/2003"));
        staff3.setContactNo("9962506073");
        staff3.setRole(Role.ASSISTANT_PROFESSOR);
        staff3.setDesignation(Designation.STAFF);
        staff3.setBoardMember(true);
        Address staff3Address =new Address();
        staff3Address.setStreet("Biology street 3");
        staff3Address.setCode("600073");
        staff3Address.setState("Tamilnadu");
        staff3Address.setCounty("India");
        staff3Address.setCity("chennai");
        staff3Address.setFlat("Biology flat 3");
        staff3.setAddress(staff3Address);
        biologyStaffs.add(staff3);

        Staff staff4=new Staff();
        staff4.setSalary(25000L);
        staff4.setName("biology4");
        staff4.setGender(Gender.FEMALE);
        staff4.setEmail("biologystaff4@kct.com");
        staff4.setDepartment(department);
        staff4.setDob(DateTime.parse("22/01/1984"));
        staff4.setDoj(DateTime.parse("22/01/2004"));
        staff4.setContactNo("9962506074");
        staff4.setRole(Role.PROFESSOR);
        staff4.setDesignation(Designation.HOD);
        staff4.setBoardMember(true);
        Address staff4Address =new Address();
        staff4Address.setStreet("Biology street 4");
        staff4Address.setCode("600074");
        staff4Address.setState("Tamilnadu");
        staff4Address.setCounty("India");
        staff4Address.setCity("chennai");
        staff4Address.setFlat("Biology flat 4");
        staff4.setAddress(staff4Address);
        biologyStaffs.add(staff4);

        Staff staff5=new Staff();
        staff5.setSalary(25000L);
        staff5.setName("biology5");
        staff5.setGender(Gender.MALE);
        staff5.setEmail("biologystaff5@kct.com");
        staff5.setDepartment(department);
        staff5.setDob(DateTime.parse("22/01/1985"));
        staff5.setDoj(DateTime.parse("22/01/2005"));
        staff5.setContactNo("9962506075");
        staff5.setRole(Role.LECTURER);
        staff5.setDesignation(Designation.STAFF);
        staff5.setBoardMember(true);
        Address staff5Address =new Address();
        staff5Address.setStreet("Biology street 5");
        staff5Address.setCode("600075");
        staff5Address.setState("Tamilnadu");
        staff5Address.setCounty("India");
        staff5Address.setCity("chennai");
        staff5Address.setFlat("Biology flat 5");
        staff5.setAddress(staff5Address);
        biologyStaffs.add(staff5);

        return biologyStaffs;
    }
}
