package com.axis.database


import com.axis.modal.Employee

class EmployeeDatabase {
    var employees= mutableListOf<Employee>()
    init {
        employees.add(Employee(101,"BHARGAVI",76000,"CS",22))
        employees.add(Employee(102,"ANAMIKA",45000,"IT",24))
        employees.add(Employee(103,"SRAVANI",64000,"HR",23))
        employees.add(Employee(104,"PRATHYUSHA",55300,"CS",26))
        employees.add(Employee(105,"REVATHI",63000,"IT",29))
    }
    fun data():MutableList<Employee>{
        return employees
    }
}