//
// Generated by JTB 1.3.2
//

package timelinedata.syntaxtree;

/**
 * The interface which all syntax tree classes must implement.
 */
public interface Node extends java.io.Serializable {
   public void accept(timelinedata.visitor.Visitor v);
   public <R,A> R accept(timelinedata.visitor.GJVisitor<R,A> v, A argu);
   public <R> R accept(timelinedata.visitor.GJNoArguVisitor<R> v);
   public <A> void accept(timelinedata.visitor.GJVoidVisitor<A> v, A argu);
}

