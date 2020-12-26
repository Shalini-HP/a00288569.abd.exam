package com.abd.exam.Service;

import com.abd.exam.common.LogType;
import com.abd.exam.model.Employee;
import com.abd.exam.model.History;
import com.abd.exam.repository.EmployeeRepository;
import com.abd.exam.repository.HistoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@Service
public class HistoryService {

    @Autowired
    private HistoryRepository historyRepository;

    @Autowired
    private EmployeeRepository employeeRepository;

}
