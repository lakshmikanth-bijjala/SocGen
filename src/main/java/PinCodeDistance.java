import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.text.SimpleDateFormat;

@Slf4j
@RestController
@RequestMapping("/v1")
public class PinCodeDistance {

 /* @Autowired
  PinCodeDistanceServiceImpl pinCodeDistanceService;
  @GetMapping("/distance")
  public ResponseEntity<?> getDistance(
      @RequestHeader(value = "origin", required = true) String origin,
      @RequestHeader(value = "destination", required = true) String destination)
      throws Exception {
    Double distance = pinCodeDistanceService.calculateDistance(origin, destination);
    return (ResponseEntity<?>) ResponseEntity.status(HttpStatus.OK);*/
  //}

}
