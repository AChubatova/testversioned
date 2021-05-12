package Tiger0239

import Tiger0239.buildTypes.*
import Tiger0239.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger0239")
    name = "Tiger0239"

    vcsRoot(Tiger0239_cVCSroot)

    buildType(Tiger0239_Hi1)
    buildType(Tiger0239_Hi2)
    buildType(Tiger0239_Hi3)
    buildType(Tiger0239_Hi0)
})
