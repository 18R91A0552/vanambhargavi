package com.axis.app

import com.axis.modal.Employee

import com.axis.service.EmployeeService




    fun main() {

        var employeeService = EmployeeService()
        //var emp =employeeService.viewAllEmployees()
//    for (i in emp){
//        println("${i.id} | ${i.name} | ${i.salary} | ${i.department} | ${i.age}")
//    }
        //Adding employee
        var employee = Employee(106, "BHARGAVI", 50000, "HR", 26)
        employeeService.addNewEmployee(employee)
        employeeService.viewAllEmployees()
    }

