package com.example.exercise.api.service;

import com.example.exercise.api.model.ServiceSpending;

import com.example.exercise.api.model.Spending;

import java.util.List;

//lavanya

public interface SpendingService {

  List<Spending> getSpending();

  List<ServiceSpending> getServiceSpending();
}
