package com.kotlinab

class ThanhVien(
    private var id: String,
    private var name: String,
    private var tuoi: Int,
    private var h: Float
) {
    fun getId(): String {
        return id
    }

    fun getName(): String {
        return name
    }

    fun getTuoi(): Int {
        return tuoi
    }

    fun getH(): Float {
        return h
    }

    fun setId(id: String) {
        this.id = id
    }

    fun setName(name: String) {
        this.name = name
    }

    fun setTuoi(tuoi: Int) {
        this.tuoi = tuoi
    }

    fun setH(h: Float) {
        this.h = h
    }
}