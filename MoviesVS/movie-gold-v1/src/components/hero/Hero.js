import './Hero.css';
import Corousel from'react-material-ui-carousel';
import { Paper } from '@mui/material';
import { FontAwesomeIcon } from '@fortawesome/react-fontawesome';
import { faCirclePlay } from '@fortawesome/free-solid-svg-icons';
import { Link, useNavigate} from 'react-router-dom';
import { Button } from 'react-bootstrap';

const Hero = ({movies}) => {

        const navigate = useNavigate();

        function reviews(movieId)
        {
            navigate('/Reviews/${movieId}');
        }

  return (
    <div className='movie-carousel-container'>
        <Corousel>
            {
                movies.map((movie) =>{
                    return(
                    <Paper key={movie.imdbId}>
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
                                    <Link t0={'/Trailer/${movie.trailerLink.substring(movie.trailerLink.length - 11)}'}>
                                    <div className="play-button-icon-container">
                                        <FontAwesomeIcon className="play-button-icon"
                                        icon={faCirclePlay}
                                        />

                                    </div>
                                    </Link>

                                    <div className="movie-review-button-container">
                                        <Button variant="info" onClick={()=> reviews(movie.imdbId)}>Reviews</Button>
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