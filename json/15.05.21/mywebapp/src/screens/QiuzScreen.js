import React, {Component} from 'react'
import './QuizScreen.css'
import {questions, caculateMarks} from '../data/fakeData'
export default class QuizScreen extends Component {
    state = {
        questions: questions,
        totalMarks: 0,
        showMark: false,
    }
    render() {
        return <div className="container">
            <h1>Mời bạn chọn câu trả lời:</h1>
            {this.state.questions.map(question => {
                const {content,allAnswers,rightAnswers,selectedAnswers} = question
                return <div className="bd-example">
                    <h3>{content}</h3>
                    {allAnswers.map(eachAnswer=> <div className="form-check">
                        <input className="form-check-input" 
                            onChange={(event)=>{
                                console.log(`eachAnswer = ${eachAnswer}`)
                                let cloneQuestions =[...questions]
                                cloneQuestions.filter(eachQuestion => eachQuestion.content == content)[0].selectedAnswers = [allAnswers.indexOf(eachAnswer)]
                                this.setState({
                                    questions: cloneQuestions
                                })
                            }}
                            type="radio" name={content} id={`${content}1`}/>
                        <label className="form-check-label" for={`${content}1`}>
                            {eachAnswer}
                        </label>
                    </div>)}    
                </div>
            })} 
            {this.state.showMark == true && <p class="text-danger">Total Marks = {this.state.totalMarks}</p>}
            <button type="button"
                onClick={(event)=>{
                    console.log(JSON.stringify(this.state.questions))
                    this.setState({
                        totalMarks: caculateMarks(this.state.questions),
                        showMark:true
                    })
                }}
                class="btn btn-primary mt-2">Submit your answer</button>        
        </div>
    }
}