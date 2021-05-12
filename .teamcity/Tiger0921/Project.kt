package Tiger0921

import Tiger0921.buildTypes.*
import Tiger0921.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger0921")
    name = "Tiger0921"

    vcsRoot(Tiger0921_cVCSroot)

    buildType(Tiger0921_Hi3)
    buildType(Tiger0921_Hi1)
    buildType(Tiger0921_Hi2)
    buildType(Tiger0921_Hi0)
})
