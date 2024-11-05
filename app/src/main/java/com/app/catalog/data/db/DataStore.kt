package com.app.catalog.data.db

import com.app.catalog.R
import com.app.catalog.data.entity.Catalog
import com.app.catalog.data.entity.CatalogRange
import com.app.catalog.data.entity.CatalogType

class DataStore {
    val citySubItems = listOf(
        CatalogRange(R.drawable.thumbnail_city, "New York", "The city that never sleeps."),
        CatalogRange(R.drawable.thumbnail_city, "Paris", "The city of love and romance."),
        CatalogRange(R.drawable.thumbnail_city, "Tokyo", "A bustling metropolis with ancient traditions."),
        CatalogRange(R.drawable.thumbnail_city, "London", "A historic city with a rich cultural heritage."),
        CatalogRange(R.drawable.thumbnail_city, "Rome", "The eternal city with its ancient ruins."),
        CatalogRange(R.drawable.thumbnail_city, "Sydney", "A vibrant city with stunning harbor views."),
        CatalogRange(R.drawable.thumbnail_city, "Dubai", "A futuristic city known for its luxury and innovation."),
        CatalogRange(R.drawable.thumbnail_city, "Barcelona", "A city with beautiful architecture and a vibrant arts scene."),
        CatalogRange(R.drawable.thumbnail_city, "Amsterdam", "A city of canals and bicycles."),
        CatalogRange(R.drawable.thumbnail_city, "Prague", "A fairytale city with stunning castles and bridges."),
        CatalogRange(R.drawable.thumbnail_city, "Kyoto", "An ancient city with traditional temples and gardens."),
        CatalogRange(R.drawable.thumbnail_city, "Berlin", "A city with a complex history and a thriving arts scene."),
        CatalogRange(R.drawable.thumbnail_city, "Budapest", "A city with stunning architecture and a vibrant nightlife."),
        CatalogRange(R.drawable.thumbnail_city, "Vienna", "A city of music and culture."),
        CatalogRange(R.drawable.thumbnail_city, "Istanbul", "A city that bridges Europe and Asia."),
        CatalogRange(R.drawable.thumbnail_city, "Rio de Janeiro", "A city known for its beaches and carnival."),
        CatalogRange(R.drawable.thumbnail_city, "Cape Town", "A city with stunning natural beauty and a diverse culture."),
        CatalogRange(R.drawable.thumbnail_city, "Singapore", "A modern city with a focus on sustainability."),
        CatalogRange(R.drawable.thumbnail_city, "Seoul", "A vibrant city with a unique blend of old and new."),
        CatalogRange(R.drawable.thumbnail_city, "Mumbai", "A bustling city with a rich history and culture.")
    )

    val flowerSubItems = listOf(
        CatalogRange(R.drawable.thumbnail_flower, "Rose", "Roses are popular flowers known for their beauty and fragrance."),
        CatalogRange(R.drawable.thumbnail_flower, "Lily", "Lilies are elegant flowers with a wide variety of colors and shapes."),
        CatalogRange(R.drawable.thumbnail_flower, "Sunflower", "Sunflowers are large flowers known for their bright yellow petals."),
        CatalogRange(R.drawable.thumbnail_flower, "Tulip", "Tulips are spring flowers with vibrant colors and bell-shaped blooms."),
        CatalogRange(R.drawable.thumbnail_flower, "Lotus", "Lotus flowers are aquatic plants with beautiful blooms and symbolic significance."),
        CatalogRange(R.drawable.thumbnail_flower, "Orchid", "Orchids are diverse and exotic flowers with intricate shapes and colors."),
        CatalogRange(R.drawable.thumbnail_flower, "Daisy", "Daisies are cheerful flowers with simple, classic beauty."),
        CatalogRange(R.drawable.thumbnail_flower, "Lavender", "Lavender flowers are known for their calming fragrance and purple color."),
        CatalogRange(R.drawable.thumbnail_flower, "Magnolia", "Magnolia flowers are large, fragrant blooms that often symbolize purity and nobility."),
        CatalogRange(R.drawable.thumbnail_flower, "Jasmine", "Jasmine flowers are delicate and fragrant, often used in perfumes and teas."),
        CatalogRange(R.drawable.thumbnail_flower, "Hibiscus", "Hibiscus flowers are large and colorful, often used in tropical gardens and landscaping."),
        CatalogRange(R.drawable.thumbnail_flower, "Cherry Blossom", "Cherry blossoms are delicate flowers that symbolize spring and renewal."),
        CatalogRange(R.drawable.thumbnail_flower, "Sunflower", "Sunflowers are large flowers known for their bright yellow petals."),
        CatalogRange(R.drawable.thumbnail_flower, "Tulip", "Tulips are spring flowers with vibrant colors and bell-shaped blooms."),
        CatalogRange(R.drawable.thumbnail_flower, "Lotus", "Lotus flowers are aquatic plants with beautiful blooms and symbolic significance."),
        CatalogRange(R.drawable.thumbnail_flower, "Orchid", "Orchids are diverse and exotic flowers with intricate shapes and colors."),
        CatalogRange(R.drawable.thumbnail_flower, "Daisy", "Daisies are cheerful flowers with simple, classic beauty."),
        CatalogRange(R.drawable.thumbnail_flower, "Lavender", "Lavender flowers are known for their calming fragrance and purple color."),
        CatalogRange(R.drawable.thumbnail_flower, "Magnolia", "Magnolia flowers are large, fragrant blooms that often symbolize purity and nobility."),
        CatalogRange(R.drawable.thumbnail_flower, "Jasmine", "Jasmine flowers are delicate and fragrant, often used in perfumes and teas.")
    )

    val dogSubItems = listOf(
        CatalogRange(R.drawable.thumbnail_dog, "German Shepherd", "A loyal and intelligent breed known for its versatility."),
        CatalogRange(R.drawable.thumbnail_dog, "Golden Retriever", "A friendly and energetic breed with a golden coat."),
        CatalogRange(R.drawable.thumbnail_dog, "Labrador Retriever", "A popular and playful breed known for its intelligence."),
        CatalogRange(R.drawable.thumbnail_dog, "Husky", "A strong and athletic breed with a thick coat and distinctive eyes."),
        CatalogRange(R.drawable.thumbnail_dog, "Poodle", "A curly-coated breed known for its intelligence and hypoallergenic qualities."),
        CatalogRange(R.drawable.thumbnail_dog, "Bulldog", "A sturdy and muscular breed with a wrinkled face and a calm demeanor."),
        CatalogRange(R.drawable.thumbnail_dog, "Dachshund", "A long-bodied breed with short legs and a playful personality."),
        CatalogRange(R.drawable.thumbnail_dog, "Shiba Inu", "A spitz breed from Japan known for its loyalty and independent nature."),
        CatalogRange(R.drawable.thumbnail_dog, "Border Collie", "A highly intelligent and energetic breed known for its herding abilities."),
        CatalogRange(R.drawable.thumbnail_dog, "Rottweiler", "A strong and protective breed known for its loyalty and intelligence."),
        CatalogRange(R.drawable.thumbnail_dog, "Boxer", "A playful and energetic breed with a muscular build and a friendly demeanor."),
        CatalogRange(R.drawable.thumbnail_dog, "Doberman Pinscher", "A loyal and intelligent breed known for its sleek appearance and protective instincts."),
        CatalogRange(R.drawable.thumbnail_dog, "Chihuahua", "A small and affectionate breed known for its big personality."),
        CatalogRange(R.drawable.thumbnail_dog, "Pug", "A playful and charming breed with a wrinkled face and a short snout."),
        CatalogRange(R.drawable.thumbnail_dog, "French Bulldog", "A friendly and playful breed with a distinctive bat-like ears."),
        CatalogRange(R.drawable.thumbnail_dog, "Australian Shepherd", "An intelligent and energetic breed known for its herding abilities and beautiful coat."),
        CatalogRange(R.drawable.thumbnail_dog, "Siberian Husky", "A strong and athletic breed with a thick coat and distinctive eyes."),
        CatalogRange(R.drawable.thumbnail_dog, "Great Dane", "A gentle giant known for its large size and calm demeanor."),
        CatalogRange(R.drawable.thumbnail_dog, "Yorkshire Terrier", "A small and affectionate breed with a long, flowing coat."),
        CatalogRange(R.drawable.thumbnail_dog, "Dalmatian", "A spotted breed known for its playful personality and historical role as a coach dog.")
    )

    val carSubItems = listOf(
        CatalogRange(R.drawable.thumbnail_car,"Tesla", "Tesla is known for electric cars."),
        CatalogRange(R.drawable.thumbnail_car,"BMW", "BMW is a luxury German automaker."),
        CatalogRange(R.drawable.thumbnail_car,"Audi", "Audi is a premium German automobile manufacturer."),
        CatalogRange(R.drawable.thumbnail_car,"Mercedes", "Mercedes-Benz is a global luxury car brand."),
        CatalogRange(R.drawable.thumbnail_car,"Ford", "Ford is an American multinational automaker."),
        CatalogRange(R.drawable.thumbnail_car,"Chevrolet", "Chevrolet is a division of General Motors."),
        CatalogRange(R.drawable.thumbnail_car,"Honda", "Honda is a Japanese public multinational conglomerate."),
        CatalogRange(R.drawable.thumbnail_car,"Toyota", "Toyota is a Japanese automotive manufacturer."),
        CatalogRange(R.drawable.thumbnail_car,"Nissan", "Nissan is a Japanese automobile manufacturer."),
        CatalogRange(R.drawable.thumbnail_car,"Hyundai", "Hyundai is a South Korean multinational automotive manufacturer."),
        CatalogRange(R.drawable.thumbnail_car, "Lexus", "Lexus is a luxury vehicle division of Toyota."),
        CatalogRange(R.drawable.thumbnail_car, "Jaguar", "Jaguar is a British luxury car manufacturer."),
        CatalogRange(R.drawable.thumbnail_car, "Porsche", "Porsche is a German automobile manufacturer known for high-performance sports cars."),
        CatalogRange(R.drawable.thumbnail_car, "Land Rover", "Land Rover is known for its rugged and luxurious off-road vehicles."),
        CatalogRange(R.drawable.thumbnail_car, "Subaru", "Subaru is a Japanese automaker known for its all-wheel-drive vehicles."),
        CatalogRange(R.drawable.thumbnail_car, "Mazda", "Mazda is a Japanese automaker known for its sporty cars and innovative technology."),
        CatalogRange(R.drawable.thumbnail_car, "Chrysler", "Chrysler is an American automaker with a range of cars and SUVs."),
        CatalogRange(R.drawable.thumbnail_car, "Jeep", "Jeep is known for its off-road vehicles and rugged design."),
        CatalogRange(R.drawable.thumbnail_car, "Buick", "Buick is an American brand known for its premium vehicles."),
        CatalogRange(R.drawable.thumbnail_car, "Acura", "Acura is the luxury vehicle division of Honda.")
    )

    val bikeSubItems = listOf(
        CatalogRange(R.drawable.thumbnail_bike,"Harley-Davidson", "Harley-Davidson is an American motorcycle manufacturer."),
        CatalogRange(R.drawable.thumbnail_bike,"Ducati", "Ducati is an Italian motorcycle manufacturer."),
        CatalogRange(R.drawable.thumbnail_bike,"Yamaha", "Yamaha is a Japanese manufacturer of motorcycles."),
        CatalogRange(R.drawable.thumbnail_bike,"Kawasaki", "Kawasaki is a Japanese manufacturer of motorcycles and ATVs."),
        CatalogRange(R.drawable.thumbnail_bike,"Suzuki", "Suzuki is a Japanese manufacturer of motorcycles and automobiles."),
        CatalogRange(R.drawable.thumbnail_bike,"BMW Motorrad", "BMW Motorrad is the motorcycle brand of BMW."),
        CatalogRange(R.drawable.thumbnail_bike,"Triumph", "Triumph Motorcycles is the largest UK motorcycle manufacturer."),
        CatalogRange(R.drawable.thumbnail_bike,"Royal Enfield", "Royal Enfield is an Indian multinational motorcycle manufacturer."),
        CatalogRange(R.drawable.thumbnail_bike,"KTM", "KTM is an Austrian manufacturer of motorcycles and sports cars."),
        CatalogRange(R.drawable.thumbnail_bike,"Honda", "Honda is known for its motorcycles, cars, and power equipment."),
        CatalogRange(R.drawable.thumbnail_bike, "MV Agusta", "MV Agusta is an Italian motorcycle manufacturer known for high-performance bikes."),
        CatalogRange(R.drawable.thumbnail_bike, "Buell", "Buell is an American motorcycle brand known for innovative designs."),
        CatalogRange(R.drawable.thumbnail_bike, "Husqvarna", "Husqvarna is a Swedish brand known for its off-road and dual-sport motorcycles."),
        CatalogRange(R.drawable.thumbnail_bike, "Benelli", "Benelli is an Italian motorcycle manufacturer with a range of bikes."),
        CatalogRange(R.drawable.thumbnail_bike, "Moto Guzzi", "Moto Guzzi is an Italian motorcycle manufacturer known for its unique V-twin engines."),
        CatalogRange(R.drawable.thumbnail_bike, "Aprilia", "Aprilia is an Italian motorcycle manufacturer known for its racing bikes."),
        CatalogRange(R.drawable.thumbnail_bike, "Norton", "Norton is a British motorcycle manufacturer with a rich history."),
        CatalogRange(R.drawable.thumbnail_bike, "BSA", "BSA is a British motorcycle brand known for classic bikes."),
        CatalogRange(R.drawable.thumbnail_bike, "Indian Motorcycle", "Indian Motorcycle is an American brand known for its heavyweight cruisers."),
        CatalogRange(R.drawable.thumbnail_bike, "MOTO3", "MOTO3 is a brand specializing in affordable, lightweight motorcycles.")

    )


    val catalogList = listOf(
        Catalog(R.drawable.city, CatalogType.CITY),
        Catalog(R.drawable.flower, CatalogType.FLOWER),
        Catalog(R.drawable.dog, CatalogType.DOG),
        Catalog(R.drawable.car, CatalogType.CAR),
        Catalog(R.drawable.bike, CatalogType.BIKE)
    )



}