package Tiger0636

import Tiger0636.buildTypes.*
import Tiger0636.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger0636")
    name = "Tiger0636"

    vcsRoot(Tiger0636_cVCSroot)

    buildType(Tiger0636_Hi3)
    buildType(Tiger0636_Hi2)
    buildType(Tiger0636_Hi1)
    buildType(Tiger0636_Hi0)
})
