let questions = [
    {
        content: 'Một cộng 1 bằng mấy ?', 
        allAnswers : ['một', 'sau', 2, 'ba', 'năm'],
        rightAnswers: [2],
        selectedAnswers:[],
        //isCorrect
    },
    {
        content: 'Choose the correct HTML element for the largest heading?', 
        allAnswers :['<heading>', '<h1>', '<h2>', 'h3', 'năm'],
        rightAnswers: [1],
        selectedAnswers:[] 
        //isCorrect:
    },
    {
        content: 'Who is making the Web standards', 
        allAnswers :['Mozilla', 'The WWW consorsium', 'Google', 'Microsoft'],
        rightAnswers: [1],
        selectedAnswers:[] 
        //isCorrect:
    },
    {
        content: 'What does HTML stand for??', 
        allAnswers :['Hyperlinks and Text Markup Language', ' Home Tool Markup Language', 'Hyper Text Markup Language'],
        rightAnswers: [2],
        selectedAnswers:[] 
        //isCorrect:
    }
]
function caculateMarks(questions){
    let totalMarks = 0
    questions.forEach(question => {
        if(compare2Arrays(question.rightAnswers,question.selectedAnswers) == true) {
            totalMarks++
        }
    })
    return totalMarks
}
function compare2Arrays(array1,array2){
    array1 = array1.map(item => `${item}`)
    array2 = array2.map(item => `${item}`)
    return array1.length == array2.length &&
            array1.filter(element => array2.includes(element)).length == array1.length
}
module.exports = {
    questions,
    caculateMarks,
}