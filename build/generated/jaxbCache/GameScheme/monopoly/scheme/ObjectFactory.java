//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.5-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.06.10 at 06:13:27 PM IDT 
//


package monopoly.scheme;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the monopoly.scheme package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _MonopolyBoardGotoJailSquare_QNAME = new QName("", "gotoJailSquare");
    private final static QName _MonopolyBoardSquare_QNAME = new QName("", "square");
    private final static QName _MonopolyBoardStartSquare_QNAME = new QName("", "startSquare");
    private final static QName _MonopolyBoardParkingSquare_QNAME = new QName("", "parkingSquare");
    private final static QName _MonopolyBoardJailSlashFreeSpaceSquare_QNAME = new QName("", "jailSlashFreeSpaceSquare");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: monopoly.scheme
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Monopoly }
     * 
     */
    public Monopoly createMonopoly() {
        return new Monopoly();
    }

    /**
     * Create an instance of {@link Monopoly.Assets }
     * 
     */
    public Monopoly.Assets createMonopolyAssets() {
        return new Monopoly.Assets();
    }

    /**
     * Create an instance of {@link Monopoly.Assets.Countries }
     * 
     */
    public Monopoly.Assets.Countries createMonopolyAssetsCountries() {
        return new Monopoly.Assets.Countries();
    }

    /**
     * Create an instance of {@link Monopoly.Surprise }
     * 
     */
    public Monopoly.Surprise createMonopolySurprise() {
        return new Monopoly.Surprise();
    }

    /**
     * Create an instance of {@link Monopoly.Warrant }
     * 
     */
    public Monopoly.Warrant createMonopolyWarrant() {
        return new Monopoly.Warrant();
    }

    /**
     * Create an instance of {@link Monopoly.Board }
     * 
     */
    public Monopoly.Board createMonopolyBoard() {
        return new Monopoly.Board();
    }

    /**
     * Create an instance of {@link CityType }
     * 
     */
    public CityType createCityType() {
        return new CityType();
    }

    /**
     * Create an instance of {@link StartSquareType }
     * 
     */
    public StartSquareType createStartSquareType() {
        return new StartSquareType();
    }

    /**
     * Create an instance of {@link GotoCard }
     * 
     */
    public GotoCard createGotoCard() {
        return new GotoCard();
    }

    /**
     * Create an instance of {@link MonetaryCard }
     * 
     */
    public MonetaryCard createMonetaryCard() {
        return new MonetaryCard();
    }

    /**
     * Create an instance of {@link GotoJailSquareType }
     * 
     */
    public GotoJailSquareType createGotoJailSquareType() {
        return new GotoJailSquareType();
    }

    /**
     * Create an instance of {@link SimpleAssetType }
     * 
     */
    public SimpleAssetType createSimpleAssetType() {
        return new SimpleAssetType();
    }

    /**
     * Create an instance of {@link SquareType }
     * 
     */
    public SquareType createSquareType() {
        return new SquareType();
    }

    /**
     * Create an instance of {@link JailSlashFreeSpaceSquareType }
     * 
     */
    public JailSlashFreeSpaceSquareType createJailSlashFreeSpaceSquareType() {
        return new JailSlashFreeSpaceSquareType();
    }

    /**
     * Create an instance of {@link ParkingSquareType }
     * 
     */
    public ParkingSquareType createParkingSquareType() {
        return new ParkingSquareType();
    }

    /**
     * Create an instance of {@link GetOutOfJailCard }
     * 
     */
    public GetOutOfJailCard createGetOutOfJailCard() {
        return new GetOutOfJailCard();
    }

    /**
     * Create an instance of {@link Monopoly.Assets.Utilities }
     * 
     */
    public Monopoly.Assets.Utilities createMonopolyAssetsUtilities() {
        return new Monopoly.Assets.Utilities();
    }

    /**
     * Create an instance of {@link Monopoly.Assets.Transportations }
     * 
     */
    public Monopoly.Assets.Transportations createMonopolyAssetsTransportations() {
        return new Monopoly.Assets.Transportations();
    }

    /**
     * Create an instance of {@link Monopoly.Assets.Countries.Country }
     * 
     */
    public Monopoly.Assets.Countries.Country createMonopolyAssetsCountriesCountry() {
        return new Monopoly.Assets.Countries.Country();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GotoJailSquareType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "gotoJailSquare", scope = Monopoly.Board.class)
    public JAXBElement<GotoJailSquareType> createMonopolyBoardGotoJailSquare(GotoJailSquareType value) {
        return new JAXBElement<GotoJailSquareType>(_MonopolyBoardGotoJailSquare_QNAME, GotoJailSquareType.class, Monopoly.Board.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SquareType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "square", scope = Monopoly.Board.class)
    public JAXBElement<SquareType> createMonopolyBoardSquare(SquareType value) {
        return new JAXBElement<SquareType>(_MonopolyBoardSquare_QNAME, SquareType.class, Monopoly.Board.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StartSquareType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "startSquare", scope = Monopoly.Board.class)
    public JAXBElement<StartSquareType> createMonopolyBoardStartSquare(StartSquareType value) {
        return new JAXBElement<StartSquareType>(_MonopolyBoardStartSquare_QNAME, StartSquareType.class, Monopoly.Board.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ParkingSquareType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "parkingSquare", scope = Monopoly.Board.class)
    public JAXBElement<ParkingSquareType> createMonopolyBoardParkingSquare(ParkingSquareType value) {
        return new JAXBElement<ParkingSquareType>(_MonopolyBoardParkingSquare_QNAME, ParkingSquareType.class, Monopoly.Board.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link JailSlashFreeSpaceSquareType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "jailSlashFreeSpaceSquare", scope = Monopoly.Board.class)
    public JAXBElement<JailSlashFreeSpaceSquareType> createMonopolyBoardJailSlashFreeSpaceSquare(JailSlashFreeSpaceSquareType value) {
        return new JAXBElement<JailSlashFreeSpaceSquareType>(_MonopolyBoardJailSlashFreeSpaceSquare_QNAME, JailSlashFreeSpaceSquareType.class, Monopoly.Board.class, value);
    }

}
