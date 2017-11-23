$(document).ready (function () {
    const body = document.getElementById("body");
    const url = "http://localhost:8080/evaluations";
    const submit = document.getElementById("btn-submit");
    var selectTraineeId = "1";
    $('#selectTrainee').change(function (e) {
        selectTraineeId = $(this).val();
    });
    var selectCourseId = "1";
    $('#selectCourse').change(function (e) {
        selectCourseId = e.target.value;
    });
    var selectInstructorId ="1";
    $('#selectInstructor').change(function (e) {
        selectInstructorId = e.target.value;
    });
    var general1 = "1";
    $('#general1').change(function (e) {
        general1 = e.target.value;
    });
    var general2 = "1";
    $('#general2').change(function (e) {
        general2 = e.target.value;
    });
    var general3 = "1";
    $('#general3').change(function (e) {
        general3 = e.target.value;
    });
    var class1 = "true";
    $('#class1').change(function (e) {
        class1 = e.target.value;
    });
    var class2 = "true";
    $('#class2').change(function (e) {
        class2 = e.target.value;
    });
    var instructor1 = "1";
    $('#instructor1').change(function (e) {
        instructor1 = e.target.value;
    });
    var instructor2 = "1";
    $('#instructor2').change(function (e) {
        instructor2 = e.target.value;
    });
    var instructor3 = "1";
    $('#instructor3').change(function (e) {
        instructor3 = e.target.value;
    });
    var instructor4 = "1";
    $('#instructor4').change(function (e) {
        instructor4 = e.target.value;
    });
    var instructor5 = "1";
    $('#instructor5').change(function (e) {
        instructor5 = e.target.value;
    });
    var instructor6 = "1";
    $('#instructor6').change(function (e) {
        instructor6 = e.target.value;
    });
    var content1 = "1";
    $('#content1').change(function (e) {
        content1 = e.target.value;
    });
    var content2 = "1";
    $('#content2').change(function (e) {
        content2 = e.target.value;
    });
    var content3 = "1";
    $('#content3').change(function (e) {
        content3 = e.target.value;
    });
    var content4 = "true";
    $('#content4').change(function (e) {
        content4 = e.target.value;
    });
    var topicSelect = "none";
    $('#topicSelect').on('change',function() {
        topicSelect = $(this).val() == "" ? "none" : $(this).val();
    });

    $("#body").on("click", "#btn-submit", function() {
        /*var firstName = document.getElementById("inputFirstName").value;
        var lastName = document.getElementById("inputLastName").value;
        var email = document.getElementById("inputEmail").value;
        var phone = document.getElementById("inputPhone").value;
        var jobRole = document.getElementById("inputJobRole").value;
        var company = document.getElementById("inputCompany").value;*/

        var objective = document.getElementById("objective").value;
        var suggestions = document.getElementById("suggestions").value;
        
        var form = JSON.stringify([
            {"answer" : objective, "traineeId" : selectTraineeId, "questionTypeId" : 1, "instructorId" : selectInstructorId,
            "courseId": selectCourseId, "answerTypeId" : 3},
            {"answer" : general1, "traineeId" : selectTraineeId, "questionTypeId" : 3, "instructorId" : selectInstructorId,
            "courseId": selectCourseId, "answerTypeId" : 1},
            {"answer" : general2, "traineeId" : selectTraineeId, "questionTypeId" : 3, "instructorId" : selectInstructorId,
            "courseId": selectCourseId, "answerTypeId" : 1},
            {"answer" : general3, "traineeId" : selectTraineeId, "questionTypeId" : 3, "instructorId" : selectInstructorId,
            "courseId": selectCourseId, "answerTypeId" : 1},
            {"answer" : class1, "traineeId" : selectTraineeId, "questionTypeId" : 4, "instructorId" : selectInstructorId,
            "courseId": selectCourseId, "answerTypeId" : 2},
            {"answer" : class2, "traineeId" : selectTraineeId, "questionTypeId" : 4, "instructorId" : selectInstructorId,
            "courseId": selectCourseId, "answerTypeId" : 2},
            {"answer" : instructor1, "traineeId" : selectTraineeId, "questionTypeId" : 5, "instructorId" : selectInstructorId,
            "courseId": selectCourseId, "answerTypeId" : 1},
            {"answer" : instructor2, "traineeId" : selectTraineeId, "questionTypeId" : 5, "instructorId" : selectInstructorId,
            "courseId": selectCourseId, "answerTypeId" : 1},
            {"answer" : instructor3, "traineeId" : selectTraineeId, "questionTypeId" : 5, "instructorId" : selectInstructorId,
            "courseId": selectCourseId, "answerTypeId" : 1},
            {"answer" : instructor4, "traineeId" : selectTraineeId, "questionTypeId" : 5, "instructorId" : selectInstructorId,
            "courseId": selectCourseId, "answerTypeId" : 1},
            {"answer" : instructor5, "traineeId" : selectTraineeId, "questionTypeId" : 5, "instructorId" : selectInstructorId,
            "courseId": selectCourseId, "answerTypeId" : 1},
            {"answer" : instructor6, "traineeId" : selectTraineeId, "questionTypeId" : 5, "instructorId" : selectInstructorId,
            "courseId": selectCourseId, "answerTypeId" : 1},
            {"answer" : content1, "traineeId" : selectTraineeId, "questionTypeId" : 6, "instructorId" : selectInstructorId,
            "courseId": selectCourseId, "answerTypeId" : 1},
            {"answer" : content2, "traineeId" : selectTraineeId, "questionTypeId" : 6, "instructorId" : selectInstructorId,
            "courseId": selectCourseId, "answerTypeId" : 1},
            {"answer" : content3, "traineeId" : selectTraineeId, "questionTypeId" : 6, "instructorId" : selectInstructorId,
            "courseId": selectCourseId, "answerTypeId" : 1},
            {"answer" : content4, "traineeId" : selectTraineeId, "questionTypeId" : 6, "instructorId" : selectInstructorId,
            "courseId": selectCourseId, "answerTypeId" : 2},
            {"answer" : suggestions, "traineeId" : selectTraineeId, "questionTypeId" : 2, "instructorId" : selectInstructorId,
            "courseId": selectCourseId, "answerTypeId" : 3},
            {"answer" : topicSelect, "traineeId" : selectTraineeId, "questionTypeId" : 2, "instructorId" : selectInstructorId,
            "courseId": selectCourseId, "answerTypeId" : 1}
        ]);
        console.log(form);
        $.ajax({
            type: "POST",
            url: url,
            data: form,
            dataType: "text",
            contentType: "application/json",
            success: function () {
                alert("Form has been submitted");
            },
            error: function () {
                alert("Form could not be submitted");
            }
        });
    });
});