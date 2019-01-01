package com.tss.generic;
/**
 * @author huzaifa bhavnagri
 */
import org.springframework.web.bind.annotation.RestController;
import com.tss.model.Bus;
import com.tss.model.DataResponse;
import com.tss.model.Train;
import java.util.ArrayList;
import java.util.List;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class DefaultController<T> {
    @GetMapping("/generic/{id}")
    public ResponseEntity<?> generic(@PathVariable int id) {
      Train<T> train = null;
      Bus<T> bus = null;
      DataResponse<T> dataResponse = null;
      if(id==1) {
        train = new Train<T>("Train", 8, 42);
        return new ResponseEntity<>(train, HttpStatus.OK);
      } else if(id==2) {
        train = new Train<T>("Train", 8, 42);
        dataResponse = new DataResponse(train);
        return new ResponseEntity<>(dataResponse, HttpStatus.OK);
      } else if (id==3) {
        bus = new Bus<>("Bus", 125, 36, "White");
        return new ResponseEntity<>(bus, HttpStatus.OK);
      } else if (id==4) {
        bus = new Bus<>("Bus", 125, 36, "White");
        dataResponse = new DataResponse(bus);
        return new ResponseEntity<>(dataResponse, HttpStatus.OK);
      } else if (id==5) {
        List<Bus<T>> buses = new ArrayList<>();
        bus = new Bus<>("Bus 1", 125, 36, "White");
        buses.add(bus);
        bus = new Bus<>("Bus 2", 254, 36, "Black");
        buses.add(bus);
        bus = new Bus<>("Bus 3", 845, 36, "Red");
        buses.add(bus);
        bus = new Bus<>("Bus 4", 569, 36, "Green");
        buses.add(bus);
        return new ResponseEntity<>(buses, HttpStatus.OK);
      } else if (id==6) {
        List<Bus<T>> buses = new ArrayList<>();
        bus = new Bus<>("Bus 1", 125, 36, "White");
        buses.add(bus);
        bus = new Bus<>("Bus 2", 254, 36, "Black");
        buses.add(bus);
        bus = new Bus<>("Bus 3", 845, 36, "Red");
        buses.add(bus);
        bus = new Bus<>("Bus 4", 569, 36, "Green");
        buses.add(bus);
        dataResponse = new DataResponse(buses);
        return new ResponseEntity<>(dataResponse, HttpStatus.OK);
      } else if (id==7) {
        List<Train<T>> trains = new ArrayList<>();
        train = new Train<>("Train 1", 8, 42);
        trains.add(train);
        train = new Train<>("Train 2", 2, 42);
        trains.add(train);
        train = new Train<>("Train 3", 6, 36);
        trains.add(train);
        train = new Train<>("Train 4", 8, 40);
        trains.add(train);
        dataResponse = new DataResponse(trains);
        return new ResponseEntity<>(dataResponse, HttpStatus.OK);
      } else if (id==8) {
        List<Train<T>> trains = new ArrayList<>();
        train = new Train<>("Train 1", 8, 42);
        trains.add(train);
        train = new Train<>("Train 2", 2, 42);
        trains.add(train);
        train = new Train<>("Train 3", 6, 36);
        trains.add(train);
        train = new Train<>("Train 4", 8, 40);
        trains.add(train);
        dataResponse = new DataResponse(trains);
        return new ResponseEntity<>(dataResponse, HttpStatus.OK);
      } else {
        return new ResponseEntity<>("Type Not Supported", HttpStatus.BAD_REQUEST);
      }
    }
}
