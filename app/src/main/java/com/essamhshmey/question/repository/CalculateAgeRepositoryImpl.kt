package com.essamhshmey.question.repository

import androidx.lifecycle.MutableLiveData
import com.essamhshmey.question.model.entity.Person
import java.util.Calendar

class CalculateAgeRepositoryImpl: CalculateAgeRepository {
    public override fun calculateYourAge(name: String, age: String): MutableLiveData<Person> {
        val infoMutablLiveData = MutableLiveData<Person>()
        val currentYear = Calendar.getInstance().get(Calendar.YEAR)
        val yourAge= currentYear - age.toInt()
        val person= Person(name,yourAge)
        //val person= Person.Builder().Name(name).Age(yourAge)
        infoMutablLiveData.postValue(person)
        return infoMutablLiveData
    }

}