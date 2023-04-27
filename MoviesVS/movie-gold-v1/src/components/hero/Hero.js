import './Hero.css';
import Corousel from'react-material-ui-carousel';
import { Paper } from '@mui/material';
import { FontAwesomeIcon } from '@fortawesome/react-fontawesome';
import { faCirclePlay } from '@fortawesome/free-solid-svg-icons';

const Hero = ({movies}) => {
  return (
    <div className='movie-carousel-container'>
        <Corousel>
            {
                movies.map((movie) =>{
                    return(
                    <Paper>
                        <div className='movie-card-container'>
                        <div className="movie-card" style={{"--img": 'url(${movie.backdrops[0]})'}}>
                            <div className="movie-detail">
                                <div className="movie-poster">
                                    <img src= {movie.poster} alt="" />
                                </div>
                                <div className="movie-title">
                                <h4>{movie.title}</h4>
                                </div>
                                <div  className="movie-button-container">
                                    <div className="play-button-icon-container">
                                        <FontAwesomeIcon className="play-button-icon"
                                        icon={faCirclePlay}
                                        />

                                    </div>

                                </div>
                            </div>
                        </div>
                        </div>
                    </Paper>
                    )
                })
            }
        </Corousel>
    </div>
  )
}

export default Hero