package com.example.studeninfo_23115053122139

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.studeninfo_23115053122139.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        val currentStudent = Student(
            studentId = "23115053122139",
            fullName = "Trần Thanh Tài",
            className = "Cong Nghe Thong Tin",
            age = 22,
            score = 8.5
        )


        binding.tvStudentId.text = "Mã sinh viên: ${currentStudent.studentId}"
        binding.tvClassName.text = "Lớp: ${currentStudent.className}"
        binding.tvAge.text = "Tuổi: ${currentStudent.age}"
        binding.tvScore.text = "Điểm: ${currentStudent.score}"


        binding.tvFullName.text = currentStudent.fullName.toUppercaseName()

        //Gọi hàm kiểm tra Đạt/Chưa đạt
        binding.tvExtraStatus.text = currentStudent.score.toPassStatus()
    }
}