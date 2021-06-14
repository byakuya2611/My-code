import React, {Component} from 'react'
import './QuizScreen.css'
import {questions, caculateMarks} from '../data/fakeData'
import { confirmAlert } from 'react-confirm-alert';
import 'react-confirm-alert/src/react-confirm-alert.css'
export default class QuizScreen extends Component {
    state = {
        questions: questions,
        totalMarks: 0,
        showMark: false,
        remainTime: 600,
    }
    componentDidMount(){
        setInterval(() => {
            this.setState({remainTime: this.state.remainTime > 0 
                                    ? this.state.remainTime - 1 : this.state.remainTime})
        }, 1000)
    }
    render() {
        return <div className="container">
            <h1>Mời bạn chọn câu trả lời:</h1>
            <h3>Thời gian còn lại: <span class="badge rounded-pill bg-success">{this.state.remainTime}</span>s</h3>
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
                            type="checkbox" name={content} id={`${content}1`}/>
                        <label className="form-check-label" for={`${content}1`}>
                            {eachAnswer}
                        </label>
                    </div>)}    
                </div>
            })} 
            {this.state.showMark == true && <p class="text-danger">Total Marks = {this.state.totalMarks}</p>}
            {this.state.remainTime == 0 ? <h3 class="text-warning bg-dark">Time End</h3> : <button type="button"
                onClick={(event)=>{
                    console.log(JSON.stringify(this.state.questions))
                    confirmAlert({
                        title: 'Confirm to submit',
                        message: 'Are you sure to submit your answers?',
                        buttons: [
                          {
                            label: 'Yes',
                            onClick: (event) => {
                                this.setState({
                                    totalMarks: caculateMarks(this.state.questions),
                                    showMark:true
                                })
                            }
                          },
                          {
                            label: 'No',
                            onClick: (event) => {

                            }
                          }
                        ]
                      })
                }}
                class="btn btn-primary mt-2">Submit your answer</button>}        
        </div>
    }
}