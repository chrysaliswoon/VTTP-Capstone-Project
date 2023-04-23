package vttp.nus.iss.server.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import vttp.nus.iss.server.models.Reviews;
import vttp.nus.iss.server.repository.ReviewRepository;

@Service
public class ReviewService {

    @Autowired
    private ReviewRepository reviewRepo;

    public boolean createReview(Reviews review) throws Exception {
        
        reviewRepo.createReview(review);
        
        return true;
    }

    public List<Reviews> getAllReviewsByUser(String email){
        List<Reviews> allReviews = reviewRepo.findReviewByEmail(email);

        return allReviews;
        
    }


    
}
