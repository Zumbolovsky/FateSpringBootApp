package br.com.zumbolovsky.fateapp.service

import org.springframework.stereotype.Service

@Service
class KotlinOtherService {

    fun calculate(x: Int , y: Int): Int {
        return x + y
    }
}