import axios from 'axios';

export default axios.create({
    baseURL:'hettps://9c96-103-106-239-104.ap.ngrok.io',
    headers:{"ngrok-skip-browser-warning": "true"}

});